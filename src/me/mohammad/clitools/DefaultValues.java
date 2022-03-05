package me.mohammad.clitools;

public class DefaultValues {

	public static String CURRENT_OPERATING_SYSTEM;
	
	public static String[] CURRENT_CLEAR_SCREEN;
	public static String[] CURRENT_SET_TITLE;
	
	public static String[] LINUX_CLEAR_SCREEN;
	public static String[] LINUX_SET_TITLE;
	
	public static String[] WINDOWS_CLEAR_SCREEN;
	public static String[] WINDOWS_SET_TITLE;
	
	public static String STRING_CURRENT_CLEAR_SCREEN;
	public static String STRING_CURRENT_SET_TITLE;
	
	public static String STRING_LINUX_CLEAR_SCREEN;
	public static String STRING_LINUX_SET_TITLE;
	
	public static String STRING_WINDOWS_CLEAR_SCREEN;
	public static String STRING_WINDOWS_SET_TITLE;
	
	static {
		CURRENT_OPERATING_SYSTEM = System.getProperty("os.name");
		
		LINUX_CLEAR_SCREEN = new String[] { "reset" };
		LINUX_SET_TITLE = new String[] { "echo", "-ne", "\"\\033]0;%s\\007\"" };
		
		WINDOWS_CLEAR_SCREEN = new String[] { "cmd", "/c", "cls" };
		WINDOWS_SET_TITLE = new String[] { "cmd", "/c", "title %s" };
		
		STRING_WINDOWS_CLEAR_SCREEN = "cmd /c cls";
		STRING_WINDOWS_SET_TITLE = "cmd /c title %s";
		
		STRING_LINUX_CLEAR_SCREEN = "reset";
		STRING_LINUX_SET_TITLE = "echo -ne \"\\033]0;%s\\007\"";
		
		setCurrentValues();
	}
	
	private static void setCurrentValues() {
		if (CURRENT_OPERATING_SYSTEM.contains("Windows")) {
			CURRENT_CLEAR_SCREEN = WINDOWS_CLEAR_SCREEN;
			CURRENT_SET_TITLE = WINDOWS_SET_TITLE;
			STRING_CURRENT_CLEAR_SCREEN = STRING_WINDOWS_CLEAR_SCREEN;
			STRING_CURRENT_SET_TITLE = STRING_WINDOWS_SET_TITLE;
		} else {
			CURRENT_CLEAR_SCREEN = LINUX_CLEAR_SCREEN;
			CURRENT_SET_TITLE = LINUX_SET_TITLE;
			STRING_CURRENT_CLEAR_SCREEN = STRING_LINUX_CLEAR_SCREEN;
			STRING_CURRENT_SET_TITLE = STRING_LINUX_SET_TITLE;
		}
	}
	
}
