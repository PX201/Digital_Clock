# Digital_Clock

This program is a simple digital clock implemented using Java Swing. It displays the current time, day of the week, and date. The clock updates every second to reflect the current time.

## Prerequisites

- Java Development Kit (JDK) 17 or higher

## Getting Started

To use this program, follow the instructions below:

1. Clone the repository or download the source code files.
2. Open the project in your preferred Java development environment (e.g., Eclipse, IntelliJ IDEA, or Visual Studio Code).
3. Ensure that you have the JDK 17 or a higher version installed on your system.
4. Build and run the project using your Java IDE.

## Usage

Upon running the program, a window will appear displaying the digital clock. The window includes the following components:

- Time: Shows the current time in the format "hh:mm:ss a".
- Day: Displays the current day of the week.
- Date: Shows the current date in the format "MMM dd, yyyy".

The clock automatically updates every second to reflect the current time.

## Customization

You can customize the appearance of the clock by modifying the following aspects in the code:

- Font: You can change the font type and size of the time, day, and date labels by modifying the corresponding `Font` objects in the `MyClockFrame` constructor.
- Colors: You can change the background and foreground colors of the time label by modifying the `setBackground` and `setForeground` methods of the `timeLable` object in the `MyClockFrame` constructor.
- Window Size: You can adjust the size of the window by modifying the `setBounds` method in the `MyClockFrame` constructor.

Feel free to explore and make changes to suit your preferences.

## Dependencies

This program does not have any external dependencies other than the standard Java libraries.

## Acknowledgments

The implementation of this digital clock program was inspired by various online Java Swing tutorials and examples.
