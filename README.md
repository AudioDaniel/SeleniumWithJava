# Selenium POM project for QA

## Description
This test automation framework provides a robust and scalable solution for automating web application tests using industry-standard tools and best practices. It leverages Intellij IDEA as the Integrated Development Environment (IDE), Selenium WebDriver for browser automation, Cucumber for behavior-driven development, Gherkin for test scenario definition, Gradle as the build automation tool, JUnit for test execution, and follows the Page Object Model (POM) design pattern for test code organization.

## Prerequisites
To run this project locally, you need to have the following software installed:

- Intellij IDEA: [Download](https://www.jetbrains.com/idea/download/)
- Java Development Kit 17 (JDK): [Download](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- Gradle: [Download](https://gradle.org/install/)

## Installation
1. Clone this repository to your local machine.
```
git clone https://github.com/Audionoob/QACotarelo/tree/daniel
```

2. Open the project in Intellij IDEA or your desired IDE.

3. Ensure that the necessary dependencies are resolved by Gradle. You can do this by clicking the Gradle icon in the right sidebar and selecting "Refresh all Gradle projects".

4. Set up the Selenium WebDriver by downloading the appropriate browser driver for your preferred browser (Chrome, Firefox, etc.) and placing it in the project's `src/main/resources/drivers` directory.

5. Install the following plugins in Intellij IDEA:
- Cucumber for Java
- Gherkin

## Configuration
Before running the tests, you may need to configure certain settings:

1. Update the `src/main/resources/config.properties` file with the appropriate values for your test environment (e.g., base URL, credentials, timeouts).



4. Wait for the tests to complete execution. The test results will be displayed in the console.

## Project Structure
The project structure follows the Page Object Model (POM) design pattern, which promotes test code organization and reusability. This modular structure enhances maintainability and readability of the test code, making it easier to understand and update as the project grows.
The project is organized into the following folders:

- `elements`: Contains element classes representing web elements in the application under test. These classes provide methods to interact with the elements on web pages.

- `features`: Contains Gherkin feature files written in a human-readable format. Each feature file defines a set of test scenarios using Given-When-Then steps.

- `hooks`: Contains classes with Cucumber hooks that define pre and post-test execution actions. These hooks are used to set up and tear down the test environment.

- `pages`: Contains page object classes representing the web pages of the application under test. These classes encapsulate the behavior and interactions of the web pages.

- `properties`: Contains configuration properties files with environment-specific settings, such as URLs, credentials, and timeouts.

- `runner`: Contains classes responsible for configuring and executing Cucumber tests. These classes specify the glue code, feature files, and other test execution settings.

- `scripts`: Contains utility classes or scripts that provide additional functionalities or support test automation tasks.

- `stepsDefs`: Contains step definition classes that map the Given-When-Then steps in the feature files to executable code. These classes implement the actions and assertions required for test execution.

- `utils`: Contains utility classes that provide common functionalities or helper methods used across the test automation framework.

- `src/main/java`: Contains the Java source code for the application under test, including the page objects, utilities, and any other supporting classes.
- `src/main/resources`: Contains resources such as configuration files, browser drivers, and test data and feature files written in Gherkin syntax, which define the test scenarios.

## Usage
You can run the tests by using the runner (`app\src\main\java\runner\Runner.java`) and the annotations over the cucumber test cases (e.g `@Plexus`)

These are the complete execution parameters that you can use when running the project:


**-ea:** Enables assertions.

**-Dweb-driver=safari:** Specifies the browser driver as Safari.

**-Dheadless-mode=false:** Disables the headless mode of the browser.

**-DfullSteps=true:** Executes all Cucumber steps.

**-Dcucumber.filter.tags="@SauceDemo":** Filters Cucumber scenarios to only run those with the @SauceDemo tag.

**-Dwindow-size=750x1334:** Sets the browser window size to 750x1334 pixels.

## Hooks

The `screenshot` method is responsible for capturing a screenshot of the web page when a Cucumber scenario fails or when the `full-steps` system property is set to `true`. Here's how the method works:

1. It takes a `Scenario` object as a parameter. The `Scenario` object represents the current scenario being executed in the Cucumber test.

2. It retrieves the value of the `full-steps` system property using `System.getProperty("full-steps")` and converts it to a boolean value using `Boolean.parseBoolean()`. The `full-steps` property is used to control whether screenshots should be taken for all steps or only for failed scenarios.

3. It checks if the scenario has failed (`scenario.isFailed()`) or if the `fullSteps` variable is `true`. If either condition is true, the method proceeds to take a screenshot.

4. It uses the `TakesScreenshot` interface provided by Selenium WebDriver to capture the screenshot. The `driver` object is assumed to be an instance of `WebDriver` and is cast to `TakesScreenshot` to access the `getScreenshotAs()` method. The screenshot is captured as a byte array.

5. The captured screenshot is attached to the scenario report using the `attach()` method of the `Scenario` object. The screenshot is specified with the MIME type "image/png".

6. A message is printed to the console indicating that a screenshot has been taken.

By including this `screenshot` method in your test code and calling it appropriately, you can automatically capture screenshots for failed scenarios or for all steps based on your configuration. This can be useful for debugging and investigating test failures, providing visual evidence of the state of the application at specific points during test execution.


## HTML Test Report Generation

The project includes a feature that generates an HTML test report on `app\report\cucumber-report` , providing a comprehensive overview of the test execution results. The report includes details such as test case statuses, scenario descriptions, step definitions, and any associated screenshots.

To generate the HTML test report, the following steps are involved:

1. After executing the Cucumber tests, a report is automatically generated in HTML format.

2. The report captures important information about the executed scenarios, including the test results (pass or fail), the scenario descriptions, and the steps performed during the test execution.

3. In case of a scenario failure or when the `full-steps` system property is set to `true`, the report includes relevant screenshots captured during the test execution. These screenshots provide visual evidence of the application's state at critical points in the test flow.

4. The HTML test report enhances test result analysis, making it easier to identify and investigate any failures or issues encountered during the test run. The detailed information and captured screenshots assist in pinpointing the cause of failures, aiding in debugging and resolving potential issues promptly.

By leveraging the HTML test report, project stakeholders can gain insights into the test execution status, easily identify problematic scenarios, and review the captured screenshots to facilitate efficient troubleshooting and collaboration between team members.

Please refer to the generated HTML test report for a comprehensive view of the test execution results and detailed information about each executed scenario.



-----
## Contributing
Contributions to this project are welcome! If you find any issues or have suggestions for improvement, please open an issue or submit a pull request on the project's GitHub repository.

## Acknowledgements
- [Intellij IDEA](https://www.jetbrains.com/idea/)
- [Selenium](https://www.selenium.dev/)
- [Cucumber](https://cucumber.io/)
- [Gherkin](https://cucumber.io/docs/gherkin/)
- [Gradle](https://gradle.org/)
- [Page Object Model (POM)](https://www.selenium.dev/documentation/en/guidelines_and_recommendations/page_object_models/)
