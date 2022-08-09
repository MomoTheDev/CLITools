package me.mohammad.clitools;

import java.util.HashMap;
import java.util.Map;

public final class CLIColors {
	
	private static Map<String, String> colors;
	private static Map<String, String> backgrounds;
	
	static {
		colors = new HashMap<>();
		backgrounds = new HashMap<>();
		addColors();
	}
	
	private static void addColors() {
		colors.put("RESET", "\u001b[0m");
		backgrounds.put("RESET", "\u001b[0m");
		
		colors.put("BLACK", "\u001b[30m");
		colors.put("RED", "\u001b[31m");
		colors.put("GREEN", "\u001b[32m");
		colors.put("YELLOW", "\u001b[33m");
		colors.put("BLUE", "\u001b[34m");
		colors.put("PURPLE", "\u001b[35m");
		colors.put("CYAN", "\u001b[36m");
		colors.put("WHITE", "\u001b[37m");

		colors.put("BRIGHT_BLACK", "\u001b[30;1m");
		colors.put("BRIGHT_RED", "\u001b[31;1m");
		colors.put("BRIGHT_GREEN", "\u001b[32;1m");
		colors.put("BRIGHT_YELLOW", "\u001b[33;1m");
		colors.put("BRIGHT_BLUE", "\u001b[34;1m");
		colors.put("BRIGHT_PURPLE", "\u001b[35;1m");
		colors.put("BRIGHT_CYAN", "\u001b[36;1m");
		colors.put("BRIGHT_WHITE", "\u001b[37;1m");
		
		backgrounds.put("BG_BLACK", "\u001b[40m");
		backgrounds.put("BG_RED", "\u001b[41m");
		backgrounds.put("BG_GREEN", "\u001b[42m");
		backgrounds.put("BG_YELLOW", "\u001b[43m");
		backgrounds.put("BG_BLUE", "\u001b[44m");
		backgrounds.put("BG_PURPLE", "\u001b[45m");
		backgrounds.put("BG_CYAN", "\u001b[46m");
		backgrounds.put("BG_WHITE", "\u001b[47m");
		
		backgrounds.put("BG_BRIGHT_BLACK", "\u001b[40;1m");
		backgrounds.put("BG_BRIGHT_RED", "\u001b[41;1m");
		backgrounds.put("BG_BRIGHT_GREEN", "\u001b[42;1m");
		backgrounds.put("BG_BRIGHT_YELLOW", "\u001b[43;1m");
		backgrounds.put("BG_BRIGHT_BLUE", "\u001b[44;1m");
		backgrounds.put("BG_BRIGHT_PURPLE", "\u001b[45;1m");
		backgrounds.put("BG_BRIGHT_CYAN", "\u001b[46;1m");
		backgrounds.put("BG_BRIGHT_WHITE", "\u001b[47;1m");
	}
	
	public static String getColor(final String c) {
		final String color = c.toUpperCase();
		return colors.containsKey(color) ? colors.get(color) : colors.get("RESET");
	}
	
	public static String getBackground(final String c) {
		final String color = c.toUpperCase();
		return backgrounds.containsKey(color) ? backgrounds.get(color) : backgrounds.get("RESET");
	}
	
}
