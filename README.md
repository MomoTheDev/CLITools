# CLITools
A Command-Line tooling library for Java

This is a tooling library to manage your command line interface (CLI).

# Example
In order to create an Instance of the CLITools class, you'd have to use the default constructor `CLITools(logErrors: boolean)`
```java
final CLITools cliTools = new CLITools(true);
```
---
You can clear the console using the `clearConsole()` method
```java
cliTools.clearConsole();
```
---
You can also change the current terminals title using the `setTitle(String)` method
```java
cliTools.setTitle("This is the new console title");
```
---
There's also a minimalistic event-listening system, you can listen to the `title_set` or the `console_clear` event

Here's an example to add a new listener
```java
cliTools.addListener("title_set", "listener1", (newTitle) -> {
    System.out.printf("Title has been changed to %s\n", newTitle);
});
```

And here's an example to remove an existing listener
```java
cliTools.removeListener("title_set", "listener1");
```

# Updating
The current support for this library is for Windows and Linux (tested on Windows 11). MacOS might be supported in the future!

I have enough time to manage this project by my own, you can suggest me some features you'd like or maybe report some bugs as well.
You can give suggestions and report bugs to me via Discord (MomoTheSiM#6478).
