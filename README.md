# 🧪 Selenium Automation Framework

A robust, scalable test automation framework built with **Selenium WebDriver (Java)**, **TestNG**, and **Page Object Model (POM)** design pattern — designed for enterprise-level web application regression testing.

---

## 🛠️ Tech Stack

| Tool | Purpose |
|------|---------|
| Selenium WebDriver | Browser automation |
| Java | Core programming language |
| TestNG | Test execution & reporting |
| Page Object Model (POM) | Framework design pattern |
| Maven | Build & dependency management |
| Jenkins | CI/CD integration |
| Git | Version control |

---

## 📁 Framework Structure

```
selenium-Framework/
├── src/
│   ├── main/java/
│   │   ├── pages/          # Page Object classes
│   │   ├── base/           # Base test setup & teardown
│   │   └── utils/          # Utility helpers (waits, config, etc.)
│   └── test/java/
│       └── tests/          # TestNG test classes
├── testng.xml              # TestNG suite configuration
├── pom.xml                 # Maven dependencies
└── README.md
```

---

## ✅ Key Features

- **Page Object Model (POM)** — Clean separation of test logic and UI interactions
- **TestNG Annotations** — Structured test lifecycle management (`@BeforeMethod`, `@AfterMethod`, `@Test`)
- **Cross-browser support** — Chrome, Firefox, Edge
- **Reusable utilities** — Explicit waits, screenshot capture, config reader
- **CI/CD ready** — Integrated with Jenkins for automated regression runs
- **HTML Reports** — TestNG generates detailed pass/fail reports after each run

---

## 🚀 How to Run

### Prerequisites
- Java 11+
- Maven 3.6+
- Chrome / Firefox browser installed
- ChromeDriver / GeckoDriver in PATH

### Run all tests
```bash
mvn clean test
```

### Run specific suite
```bash
mvn test -DsuiteXmlFile=testng.xml
```

---

## 📊 Use Cases

This framework has been used for:
- Regression testing of web applications
- E-Commerce platform testing (Shopify, Magento)
- Cross-browser compatibility validation
- CI/CD pipeline integration with Jenkins

---

## 👤 Author

**Pramod R. Gunjal** — Senior QA Engineer  
📧 pramodgunjal212@gmail.com  
🔗 [GitHub Profile](https://github.com/PramodG238)

---

> ⭐ If you find this useful, feel free to star the repo!
