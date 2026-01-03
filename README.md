# Prueba E2E - Contact Us

Automatización E2E del flujo **Contact Us** en la plataforma **Automation Exercise**  
usando **SerenityBDD con Screenplay (Java)**.

---

## 🎯 Objetivo

Validar un flujo transaccional completo que incluye:

- Navegación a la aplicación
- Acceso al formulario Contact Us
- Diligenciamiento de campos obligatorios
- Carga de archivos (Upload File)
- Manejo de alertas del navegador
- Validación del mensaje de éxito
- Retorno al Home

---

## 🛠 Tecnologías utilizadas

- Java 17+
- Gradle
- Serenity BDD
- Screenplay Pattern
- Cucumber
- JUnit
- Selenium WebDriver

---

## 💻 Prerrequisitos

- Tener instalado **Java 17+**
- Tener instalado **Gradle**
- Navegador **Chrome** actualizado
- **ChromeDriver** compatible con la versión de Chrome instalada
- Conexión a Internet (para la ejecución de tests y dependencias)

---

## ▶️ Ejecución de pruebas

1. Clonar el repositorio:

```bash
git clone https://github.com/kevingl24/pruebaE2E.git
cd pruebaE2E
Ejecutar las pruebas:

./gradlew clean test

Generar reportes de Serenity:

./gradlew aggregate


Abrir reportes:

target/site/serenity/index.html
