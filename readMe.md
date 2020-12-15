## Komoot.com | QA Automation |

### Introduction
Dear Team,
This project is a very basic Cucumber-Selenium-Maven framework, which was used in this assignment for automating the steps of three Test cases.

### Objective
The Objective is not to create a full-fledged or a complete test automation framework. We are interested in the BDD approach of acheiving the automation task.

### Preconditions to run the project

In case you want to run the project, you need to have the following software installed:

 - Java 8 SDK
 - Chrome
 - Maven
 
You might also need to download the chromedriver. The path to the driver can be set in config.properties inside the project.

### How to run the project

In case you would like to run the project you can do this either via the Cucumber plugin of your IDE or via Maven goals: clean install compile test
Also Kindly provide valid credentials for Komoot.com in feature files.

### Feature File

The feature files that we automated for this assignment can be found in "src/test/resources/features/"

### Test Object
The URL to the website is https://www.komoot.com/ This is also already configured in the config.properties file.

### Notes
The Test Report url can be found in the console out. Kindly search for "View your Cucumber Report at:" the url following this will the Test result url.