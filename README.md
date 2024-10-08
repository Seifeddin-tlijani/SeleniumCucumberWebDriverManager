# Selenium Cucumber WebDriverManager Automated Testing Project
## Project Overview
This project demonstrates the use of **Selenium WebDriver**, **Cucumber**, and **WebDriverManager** for automated web testing , following the **Page Object Model (POM)** design pattern. 

- **Selenium WebDriver**: A tool used to automate web browsers, allowing for interactions like clicks, typing, and navigating to URLs during tests.
- **Cucumber**: A testing framework that supports Behavior-Driven Development (BDD). It allows writing tests in plain language (like English) using Gherkin syntax.
- **WebDriverManager**: A library that automatically manages browser driver binaries required for Selenium tests, such as `chromedriver` for Chrome or `geckodriver` for Firefox.

## Page Object Model (POM) Approach

### What is POM?
The **Page Object Model (POM)** is a design pattern in Selenium that encourages creating a separate Java class for each web page in the application being tested. Each page class encapsulates the web elements of that page and the actions that can be performed on those elements.

### Why Use POM?
POM provides the following benefits:
- **Reusability**: Common actions (like clicking a button or entering text) are defined in one place, making the code more reusable.
- **Maintainability**: Changes to the UI can be easily handled by updating the respective page class.
- **Readability**: Test scripts become cleaner and more readable by separating the test logic from the implementation details of web elements.

### How POM is Applied in This Project
In this project, each web page is represented by a Java class.


## Getting Started

### Prerequisites
Before you begin, ensure you have met the following requirements:
- **Java 11 or higher**: Make sure you have the appropriate version of Java installed.
- **Maven**: This project uses Maven for dependency management. Install it if you haven't already.
- **IDE**: Use an Integrated Development Environment (IDE) like **IntelliJ IDEA** for development.
- **Web Browser**: Install a web browser, such as **Chrome** or **Firefox**, to run your tests.