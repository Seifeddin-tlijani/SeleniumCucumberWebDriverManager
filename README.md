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

### Structure of The Project
src/test/java
├── features/           # Contains Cucumber .feature files that describe the test scenarios using Gherkin syntax.
├── stepDefinitions/    # Contains the step definitions that link the Gherkin steps to the Selenium actions.
├── pages/              # Holds the POM-based classes representing different pages of the application.
└── runners/            # Contains the Cucumber test runner files for executing the tests.

