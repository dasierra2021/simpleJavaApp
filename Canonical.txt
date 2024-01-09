# Calculator Application Overview

This Java project presents a straightforward calculator application that incorporates both standard and scientific calculator features. The user interface (UI) is crafted using Java Swing, allowing users to execute fundamental arithmetic operations and more advanced mathematical functions like square root, power, and logarithm.

## Project Structure

The project is organized into distinct Java classes within a specific package structure:

- **src/main/java/theme/properties/Theme.java**: Defines the `Theme` class, capturing the visual theme characteristics of the calculator. This includes attributes such as background colors, text colors, and more.

- **src/main/java/theme/properties/ThemeList.java**: Houses the `ThemeList` class, acting as a collection of themes. It provides methods for obtaining themes as either a list or a map.

- **src/main/java/theme/ThemeLoader.java**: Implements the `ThemeLoader` class, responsible for loading themes from a YAML configuration file using Jackson's ObjectMapper.

- **src/main/java/ui/CalculatorUI.java**: The principal UI class. It employs the Swing framework to construct the calculator UI, incorporating buttons, input screens, and theme selectors. Users can perform various calculations and switch between standard and scientific calculator modes.

- **src/main/java/util/ColorUtil.java**: Offers a utility class, `ColorUtil`, with a function for converting hexadecimal color codes to Java Color objects.

- **src/main/java/App.java**: Serves as the main entry point for the application. It initializes and launches the Calculator UI.

## Functionality

1. **App.java**: The application's entry point. Upon execution, it creates an instance of `CalculatorUI`, triggering the setup of the calculator user interface.

2. **CalculatorUI.java**: This class manages the creation and functioning of the calculator UI components, such as buttons, input screens, and theme selectors. It handles user input, executes calculations, and updates the UI accordingly. The UI seamlessly transitions between standard and scientific calculator modes.

3. **Theme.java and ThemeList.java**: These classes define and oversee the visual themes of the calculator. Themes are loaded from a YAML configuration file through the `ThemeLoader` class.

4. **ThemeLoader.java**: Loads themes from the specified YAML configuration file using Jackson's ObjectMapper. It returns a map associating theme names with `Theme` objects.

5. **ColorUtil.java**: A utility class furnishing a method to translate hexadecimal color codes into Java Color objects.

## Utilization

1. **Execute the App.java file**: Run the `main` method in `App.java` to initiate the calculator application.

2. **Calculator UI**: The UI enables users to conduct basic and scientific calculations. Themes can be effortlessly switched, providing a personalized visual experience.

3. **Theme Configuration**: Tailor the visual appearance of the calculator by adjusting settings in the `application.yaml` file, which contains theme configurations.

## Dependencies

- **Jackson Databind**: Employed for YAML parsing and object mapping.
- **Log4j2**: Configured to facilitate logging with both console and file appenders.

## Licensing

You are free to utilize, modify, and distribute the code in accordance with the stipulations of the license.
