# Java Selenium TestNG Framework

A Java-based Web Automation Framework built using Selenium WebDriver, TestNG, Maven, and the Page Object Model (POM). This framework is designed for scalable, maintainable, and reusable UI test automation with data-driven testing and detailed reporting.

---

## 🚀 Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- JSON Data-Driven Testing
- Extent Reports
- Jenkins
- Log4j Logging

---

## ✨ Framework Features

- Page Object Model (POM)
- TestNG Framework
- Data-Driven Testing using JSON
- Cross Browser Execution
- Parallel Test Execution
- Screenshot on Test Failure
- Extent HTML Reports
- Jenkins Integration
- Reusable Utilities
- Logging Support
- Maven Build Support

---

## 📁 Project Structure

```
src
├── main
│   └── java
│       └── com.ekanth.automation
│           ├── pageobjects
│           ├── abstractcomponents
│           └── properties
│
├── test
│   ├── java
│   │   └── com.ekanth.automation
│   │       ├── tests
│   │       ├── testcomponents
│   │       └── data
│   │
│   └── resources
│       └── testdata
```

---

## 🧪 Test Scenarios Covered

- User Login
- Product Search
- Add Product to Cart
- Checkout Process
- Order Confirmation
- Error Validation
- Product Validation

---

## ▶️ Execute the Tests

Run all tests using Maven:

```bash
mvn test
```

Execute a TestNG Suite:

```bash
mvn test -DsuiteXmlFile=testng.xml
```

Run from Eclipse:

- Right-click **testng.xml**
- Run As → TestNG Suite

---

## 📊 Framework Components

- Base Test
- Page Object Classes
- TestNG Listeners
- Retry Analyzer
- Utility Classes
- JSON Data Reader
- Extent Report Manager
- Screenshot Utility
- Browser Factory

---

## 📦 Maven Commands

Clean Project

```bash
mvn clean
```

Execute Tests

```bash
mvn test
```

Clean & Execute

```bash
mvn clean test
```

Execute Specific TestNG Suite

```bash
mvn test -DsuiteXmlFile=testng.xml
```

---

## 📈 Reports

- Extent HTML Report
- TestNG Report
- Screenshot on Failure

---

## 🔧 CI/CD

This framework supports execution through Jenkins using Maven build commands.

---

## 📌 Demo Application

This framework automates a demo e-commerce web application for learning and framework demonstration purposes.

---

## 👨‍💻 Author

**Ekanth**

GitHub: https://github.com/ekanth-qa
