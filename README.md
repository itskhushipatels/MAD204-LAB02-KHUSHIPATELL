# MAD204 Lab 02 - Login & Greeting App

Student Name: Khushi Patel  
Student ID: A00198843
Date of Submission: 2025-10-14  

## Lab Overview
This lab focuses on building a simple Android application to practice core Android development skills, including:

- Creating layouts using **ConstraintLayout**
- Using common widgets such as **TextView**, **EditText**, **Button**, and **ImageView**
- Handling user interactions with **setOnClickListener**
- Passing data between Activities using **Intent**
- Styling widgets and defining reusable **button styles** in `styles.xml`
- Understanding and applying **dp vs sp sizing** and accessibility best practices

The app demonstrates a **Login + Greeting flow**:

1. **Login Screen**  
   - Displays a logo, a “Login” title, Email and Password input fields, a Login button with custom styling, and a “Forgot password?” link.
   - The Login button captures the user input (name/email) and navigates to the greeting screen.

2. **Greeting Screen**  
   - Receives the name entered on the Login screen via Intent.  
   - Displays a welcome message: “Welcome, [Name]!”  
   - Shows an image/logo.  
   - Provides a Logout button to return to the Login screen.

## Features Implemented
- **ConstraintLayout** for flexible and responsive UI
- **Custom Button Style** defined in `styles.xml`
- **User Input Handling** using `findViewById()` and `setOnClickListener()`
- **Data Passing Between Activities** using Intent extras
- **Responsive Layouts** that work in portrait and landscape orientations
- **Inline and Javadoc Documentation** for all Java classes and methods

## Files Included
- `MainActivity.java` - Handles the Login screen logic
- `SecondActivity.java` - Handles the Greeting screen logic
- `activity_main.xml` - Layout for Login screen
- `activity_second.xml` - Layout for Greeting screen
- `styles.xml` - Custom styles for buttons and themes
- `colors.xml` - Color definitions for app theming
- `README.md` - Project description and documentation

## Learning Outcomes
By completing this lab, students will be able to:

- Understand the structure of an Android project
- Create interactive UI screens and handle user events
- Pass data between Activities
- Define reusable styles and themes
- Apply good programming practices including documentation and readable code

