package me.mohammad.clitools;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class CLITools {
	
	private boolean logErrors;
	
	private List<String> titles;
	private Map<String, List<Integer>> lastReturnCodes;
	private Map<String, Map<String, Consumer<String>>> listeners;
	
	public CLITools(final boolean logErrors) {
		this.logErrors = logErrors;
		initialize();
	}
	
	private void initialize() {
		titles = new ArrayList<>();
		listeners = new HashMap<>();
		listeners.put("title_set", new HashMap<>());
		listeners.put("console_clear", new HashMap<>());
		lastReturnCodes = new HashMap<>();
		lastReturnCodes.put("title_set", new ArrayList<>());
		lastReturnCodes.put("console_clear", new ArrayList<>());
	}
	
	public void addListener(final String action, final String key, final Consumer<String> listener) {
		listeners.get(action).put(key, listener);
	}
	
	public void removeListener(final String action, final String key) {
		listeners.get(action).remove(key);
	}
	
	public List<String> getTitles() {
		return titles;
	}
	
	public Map<String, List<Integer>> getReturnCodes() {
		return lastReturnCodes;
	}
	
    public boolean setTitle(final String title) {
    	try {
    		lastReturnCodes.get("title_set").add(new ProcessBuilder(String.format(DefaultValues.STRING_CURRENT_SET_TITLE, title.replaceAll("\"", "")).split(" ")).inheritIO().start().waitFor());
			System.out.flush();
			titles.add(title);
			listeners.get("title_set").forEach((key, listener) -> listener.accept(title));
			return true;
		} catch (InterruptedException | IOException e) {
			if (logErrors)
				e.printStackTrace();
			return false;
		}
    }
    
    public boolean clearConsole() {
    	try {
    		lastReturnCodes.get("console_clear").add(new ProcessBuilder(DefaultValues.CURRENT_CLEAR_SCREEN).inheritIO().start().waitFor());
			System.out.flush();
			listeners.get("console_clear").forEach((key, listener) -> listener.accept(key));
			return true;
		} catch (InterruptedException | IOException e) {
			if (logErrors)
				e.printStackTrace();
			return false;
		}
    }
    
}
