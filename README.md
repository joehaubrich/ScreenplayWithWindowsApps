Author: Joe Haubrich - jhaubrich@devco.com.co
Presentation Date: August 29th, 2022

Table of Contents:
1. Project Description
2. Tools Used in Project
3. Creating the Project

Project Description

The purpose of this project is to demonstrate how the Serenity BDD Screenplay pattern can be applied to situations where automated tests must be created for Windows Desktop Applications, such as Calculator.

Tools Used in Project
1. IDE: IntelliJ IDEA
   https://www.jetbrains.com/idea/download/#section=windows
2. Gradle/Groovy
   https://docs.gradle.org/current/userguide/userguide.html
3. Cucumber
   https://cucumber.io/docs/gherkin/reference/
4. Serenity BDD - Screenplay
   https://serenity-bdd.github.io/docs/guide/user_guide_intro
5. WinAppDriver:
   https://github.com/Microsoft/WinAppDriver
6. Inspect Object: Similar to Appium Inspector, but for inspecting the elements within Windows Desktop Applications
   https://developer.microsoft.com/en-us/windows/downloads/windows-sdk/
7. Calculator - Windows Application
8. get-StartApps: Windows Powershell command to get the application in question to test

Creating the Project
1. Create new project in IntelliJ with the Gradle option selected
2. Create the serenity.properties file, specifying for the appium.app configuration to use a Windows Application to test. Get the application AppID by running the PowerShell Windows command get-StartApps. In this case, we're going to look at the Windows Calculator. Also see the additional specifications listed within this project.
3. Create the build.gradle file with the specifications within this project.
4. Put project together as a normal test automation suite with Screenplay, using Inspect Object to identify elements inside of application. 

