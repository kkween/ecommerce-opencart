# opencart
Selenium Hybrid Framework:

The project is based on Java-Selenium technology to automate https://demo.opencart.com/index.php website. 

Functionality covered in this automation Project : (Java, Selenium, TestNG, Maven, Page Object Model & Page Factory):

- Registration of new user

- login existing user

- browsing differnt menues

- Searching Products

- Entering address details

- adding products into cart (cart validation)

- Checkout

Added dependencies in pom.xml:

- selenium-java

- testng

- apache poi

- apache poi-ooxml

- log4j-core

- log4j-api

- extentreports

- commons-io

- commons-lang3

- commons-email

- webdrivermanager

What is a Framework?

In general, a framework is a real or conceptual structure intended to serve as a support or guide for the building of something that expands the structure into something useful.

Prior to knowing about the Hybrid Test Automation Framework, we should know about the existing frameworks:

- Data Driven Framework
- Test Script Modularity Framework
- Keyword Driven Framework
- Test Library Architecture Framework
- Hybrid Framework

Why do we need Automation framework:

Using Framework, we can solve many issues like writing code once and reusing it. Significant Reduction in Testing Cycle Time
Running the script with different set of data. Executing the scripts end-to-end without any manual intervention. ( If any error occurs from tool or application, Script run will stop. If we use framework, it will skip or fail that testcase and run with the next testcase.)

Folder Structure:
=================
Project Name
src/test/java

- pageObjects (Package)

- testBase (Package)

- testCases (Package)

- utilities (Package)

- src/test/resources -- (log4j.xml & properties files)

- testData (Folder)

- logs (Folder)

- screenshots (Folder)

- reports (Folder)

- testNG.xml

- pom.xml
