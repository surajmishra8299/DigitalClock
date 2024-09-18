# DigitalClock
- This repository contains a Java Swing-based Digital Clock project, developed using the NetBeans IDE. The digital clock provides real-time updates by fetching the system time and displaying it in a user-friendly format. This project is ideal for beginners looking to understand how to create GUI applications in Java.

# Key Features:
- Real-Time Clock: The clock updates every second to display the current time (hours, minutes, and seconds).
- Java Swing GUI: Built entirely using Java's Swing framework for creating graphical user interfaces.
- Simple and Clean Layout: The digital clock features a minimalist design with clear, easy-to-read numbers.
- Cross-Platform: Can run on any system with Java installed.

# How It Works:
- Fetching System Time: The clock uses Java's LocalTime class from the java.time package to fetch the current system time.
- Timer for Updates: A javax.swing.Timer is used to refresh the time every second, ensuring the clock is always in sync with the system time.
- GUI Creation: The GUI is created using Java Swing components like JLabel to display the time and JFrame to hold the window. The font size and color of the time can be customized for better visibility.
- Responsive Design: The clock adjusts its size based on the window size and ensures the time is centered within the window.
  
# How to Create a Digital Clock using Java Swing:
- Set Up Your Project in NetBeans:
- Open NetBeans IDE and create a new Java project.
- Add a new Java class to handle the GUI.
  
- Import Necessary Packages:
java
Copy code
import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

- Create the Clock GUI:
- Use a JFrame to create the main window.
- Add a JLabel to display the current time, and set its font size, style, and alignment.
  
- Update the Time Automatically:
Use a Timer to execute a method that continuously updates the time.
Fetch the current time using LocalTime.now() and format it as HH:MM

- Run the Application:
Once everything is set up, compile and run the project in NetBeans. The digital clock will pop up and start updating in real-time.





