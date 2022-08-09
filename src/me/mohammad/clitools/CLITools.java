package me.mohammad.clitools;

import java.awt.Color;
import java.io.IOException;

public class CLITools {
	
    public boolean setTitle(final String title) {
    	try {
    		new ProcessBuilder(String.format(DefaultValues.STRING_CURRENT_SET_TITLE, title.replaceAll("\"", "")).split(" ")).inheritIO().start().waitFor();
			System.out.flush();
			return true;
		} catch (InterruptedException | IOException e) {
			throw new CLIException("Unable to change console title: " + e.getLocalizedMessage());
		}
    }
    
    public boolean clear() {
    	try {
    		new ProcessBuilder(DefaultValues.CURRENT_CLEAR_SCREEN).inheritIO().start().waitFor();
			System.out.flush();
			return true;
		} catch (InterruptedException | IOException e) {
			throw new CLIException("Unable to clear console: " + e.getLocalizedMessage());
		}
    }
    
    public void blink() {
		System.out.print("\033[5m");
	}
	
	public void bold() {
		System.out.print("\033[1m");
	}
	
	public void italic() {
		System.out.print("\033[3m");
	}
	
	public void mark() {
		System.out.print("\033[21m");
	}
	
	public void reset() {
		System.out.print(CLIColors.getColor("RESET"));
	}
	
	public void reverse() {
		System.out.print("\033[7m");
	}
	
	public void strikethrough() {
		System.out.print("\033[9m");
	}
	
	public void underline() {
		System.out.print("\033[4m");
	}
	
	public void upperline() {
		System.out.print("\033[53m");
	}
	
	public void setColor(final String color) {
		System.out.print(CLIColors.getColor(color));
	}
	
	public void setColorRGB(int red, int green, int blue) {
		if (red > 255)
			red = 255;
		if (green > 255)
			green = 255;
		if (blue > 255)
			blue = 255;
		System.out.print(String.format("\033[38;2;%d;%d;0m", red, green, blue));
	}
	
	public void setColorHEX(final String hex) {
		try {
			final Color color = Color.decode(hex);
			System.out.printf("\033[38;2;%d;%d;0m", color.getRed(), color.getGreen(), color.getBlue());
		} catch (NumberFormatException e) {
			throw new CLIException("Unable to decode HEX color code: " + e.getLocalizedMessage());
		}
	}
	
	public void setBackground(final String color) {
		System.out.print(CLIColors.getBackground(color.startsWith("BG_") ? color : ("BG_" + color)));
	}
	
	public void setBackgroundRGB(int red, int green, int blue) {
		if (red > 255)
			red = 255;
		if (green > 255)
			green = 255;
		if (blue > 255)
			blue = 255;
		System.out.print(String.format("\033[48;2;%d;%d;0m", red, green, blue));
	}
	
	public void setBackgroundHEX(final String hex) {
		try {
			final Color color = Color.decode(hex);
			System.out.printf("\033[48;2;%d;%d;0m", color.getRed(), color.getGreen(), color.getBlue());
		} catch (NumberFormatException e) {
			throw new CLIException("Unable to decode HEX color code: " + e.getLocalizedMessage());
		}
	}
    
}
