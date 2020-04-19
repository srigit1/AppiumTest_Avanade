# AppiumTest_Avanade
This project automates Qoo10 App testing in Android Device

Instructions to use this Project:

Prerequisites:
1.Install Java, Maven,TestNG,Android SDK .
2.Install Appium Desktop Client

Project Setup:
1.Create a Maven project
2.Add below dependencies in pom.xml 
    1.selenium-java
    2.Appium java client
    3.Allure reports
3.Connect real device  and get all required desired capabilities as udid etc.Get apppackage and appactivity from APKInfo app.
4.Start Appium server from desktop client
5.Create Page Object Model framework and add locators in page objects and tests in test class
6.Inspect the elements using Inspector in Appium Desktop Client
7.Add testng.xml with corresponding classname to execute.
8.Add Allure Reports for Reporting .

Execution Steps:
1.Import this project as maven project.
2.Clean and Build the project as “mvn clean install”
3.Go to the project workspace and run the application using “mvn test” command

Execution Report:
Execution Report can be verified in the below folder 
target\surefire-reports\Android App\Qoo10 App Testing.html

Scenarios covered for Automation:
Identified Qoo10 Android Application for automation.
1.Open the app and search for “mask” item and verify the results are displayed with search criteria.
2.Navigated back to Homepage and move to  Digital section and selected iPhone case covers and selected an item and added to Wishlist
