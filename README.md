# CLITools
A Command-Line tooling library for Java

This is a tooling library to manage your command line interface (CLI).

# Example
In order to create an Instance of the CLITools class, you'd have to use the default constructor `CLITools()`
```java
final CLITools cliTools = new CLITools();
```
---
You can clear the console using the `clear()` method
```java
cliTools.clear();
```
---
You can also change the current terminals title using the `setTitle(String)` method
```java
cliTools.setTitle("This is the new console title");
```
###
# Customizing
You can easily customize your terminal using the methods in the `CLITools` class.

```java
cliTools.blink();
```
![Result](https://github.com/MomoTheDev/CLITools/tree/main/screenshots/blink.gif?raw=true)
---
```java
cliTools.bold();
```
![Result](https://github.com/MomoTheDev/CLITools/tree/main/screenshots/bold.png?raw=true)
---
```java
cliTools.italic();
```
![Result](https://github.com/MomoTheDev/CLITools/tree/main/screenshots/italic.png?raw=true)
---
```java
cliTools.mark();
```
![Result](https://github.com/MomoTheDev/CLITools/tree/main/screenshots/marked.png?raw=true)
---
```java
cliTools.reverse();
```
![Result](https://github.com/MomoTheDev/CLITools/tree/main/screenshots/reverse.png?raw=true)
---
```java
cliTools.strikethrough();
```
![Result](https://github.com/MomoTheDev/CLITools/tree/main/screenshots/strikethrough.png?raw=true)
---
```java
cliTools.underline();
```
![Result](https://github.com/MomoTheDev/CLITools/tree/main/screenshots/underlined.png?raw=true)
---
```java
cliTools.upperline();
```
![Result](https://github.com/MomoTheDev/CLITools/tree/main/screenshots/upperlined.png?raw=true)
---
```java
cliTools.setColor("BRIGHT_BLUE");
```
![Result](https://github.com/MomoTheDev/CLITools/tree/main/screenshots/colored.png?raw=true)
---
```java
cliTools.setColorHEX("#54BAB9");
```
![Result](https://github.com/MomoTheDev/CLITools/tree/main/screenshots/colored_hex.png?raw=true)
---
```java
cliTools.setColorRGB(84, 186, 185);
```
![Result](https://github.com/MomoTheDev/CLITools/tree/main/screenshots/colored_rgb.png?raw=true)
---
```java
cliTools.setBackground("BRIGHT_BLUE");
```
![Result](https://github.com/MomoTheDev/CLITools/tree/main/screenshots/background.png?raw=true)
---
```java
cliTools.setBackgroundHEX("#54BAB9");
```
![Result](https://github.com/MomoTheDev/CLITools/tree/main/screenshots/background_hex.png?raw=true)
---
```java
cliTools.setBackgroundRGB(84, 186, 185);
```
![Result](https://github.com/MomoTheDev/CLITools/tree/main/screenshots/background_rgb.png?raw=true)
---
You can always reset your customization using the `reset()` method
```java
cliTools.reset();
```
![Result](https://github.com/MomoTheDev/CLITools/tree/main/screenshots/reset.png?raw=true)
###

# Updating
The current support for this library is for Windows and Linux (tested on Windows 11). MacOS might be supported in the future!

I have enough time to manage this project by my own, you can suggest me some features you'd like or maybe report some bugs as well.
You can give suggestions and report bugs to me via Discord (MomoTheSiM#6478).
