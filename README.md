# 🧪 CucumberSeleniumJavaTemplate

Este proyecto es una plantilla base para pruebas automatizadas usando:
- Java
- Selenium WebDriver (navegador Edge)
- Cucumber (BDD)
- JUnit 5
- ExtentReports (para reportes HTML)

---

## 🗂️ Estructura del Proyecto

CucumberSeleniumJavaTemplate/ │ ├── src/test/java │ ├── features/ # Archivos .feature (Gherkin) │ ├── runner/ # Clase principal para ejecutar las pruebas │ ├── stepdefinitions/ # Clases con pasos de Cucumber │ ├── pages/ # Clases Page Object Model (POM) │ └── utils/ # WebDriver y configuración de reportes │ ├── drivers/ # msedgedriver.exe (navegador Edge) ├── pom.xml # Dependencias Maven └── README.md # Documentación del proyecto



---

## ✅ Requisitos Previos

- Java JDK 17+
- Maven
- Microsoft Edge instalado
- IntelliJ IDEA (recomendado)
- Plugin de Cucumber para IntelliJ

---

## 🔧 Instalación

1. **Clona el repositorio** o copia los archivos al directorio de tu proyecto:

Abre el proyecto en IntelliJ IDEA.

Descarga y configura Edge WebDriver:

Ve a: https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/

Descarga msedgedriver.exe y colócalo en la carpeta /drivers.


⚙️ Configuración del WebDriver
En DriverFactory.java, asegúrate de tener:

java
Copiar
Editar
System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
driver = new EdgeDriver();


🧾 Reportes HTML con ExtentReports
Después de ejecutar las pruebas, el reporte HTML se genera automáticamente en:

Copiar
Editar
target/ExtentReport.html
