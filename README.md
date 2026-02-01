## 🎯 Objetivo

El objetivo principal es ofrecer una herramienta sencilla y eficiente para que el usuario pueda convertir valores entre diferentes monedas internacionales, obteniendo tasas de cambio actualizadas y un historial detallado de las operaciones realizadas durante la sesión.

---

## ✨ Características

* **Conversión en Tiempo Real**
  Consumo de la API **ExchangeRate-API** para obtener datos precisos.

* **Soporte Multimoneda**
  Incluye conversiones para:

    * Dólar (USD) ↔ Peso Colombiano (COP)
    * Peso Mexicano (MXN) ↔ Won Surcoreano (KRW)
    * Peso Uruguayo (UYU) ↔ Yen Japonés (JPY)

* **Historial de Sesión**
  Al finalizar, la aplicación muestra una lista detallada con la fecha, hora y el resultado de todas las conversiones realizadas.

* **Interfaz Limpia**
  Menú interactivo por consola, fácil de usar.

---

## 📚 Conocimientos Adquiridos (Java)

Para el desarrollo de este código se aplicaron conceptos fundamentales y avanzados del lenguaje Java:

* **Programación Orientada a Objetos (POO)**
  Uso de clases, objetos, encapsulamiento y métodos.

* **Java Records**
  Implementación de `record` para el mapeo simplificado de datos.

* **Consumo de API HTTP**
  Uso de `HttpClient`, `HttpRequest` y `HttpResponse` para realizar peticiones externas.

* **Manejo de JSON**
  Uso de la librería **Gson** de Google para deserializar respuestas de la API en objetos Java.

* **Estructuras de Datos**
  Manejo de listas dinámicas (`ArrayList`) para almacenar el historial.

* **Manipulación de Fechas**
  Uso de `LocalDateTime` y `DateTimeFormatter` para el registro temporal de las operaciones.

* **Flujos de Control**
  Implementación de ciclos `while`, condicionales `if-else` y estructuras `switch`.

---

## ⚠️ Excepciones y Manejo de Errores

El sistema está diseñado para ser robusto frente a fallos comunes del usuario y del entorno:

* **InputMismatchException**
  Controlada cuando el usuario ingresa texto o caracteres no permitidos en un campo numérico.

* **IOException / InterruptedException**
  Gestionadas para prevenir caídas del sistema durante la conexión con la API.

* **Manejo Genérico de Excepciones**
  Se incluye un bloque `catch (Exception e)` para capturar errores inesperados y permitir que el programa continúe su ejecución sin cerrarse abruptamente.

---

## 🛠️ Requisitos

* Java **JDK 17** o superior.
* Librería **Gson** (puedes agregarla como dependencia Maven o descargar el JAR).
* Una **API Key** de **ExchangeRate-API**.

---

## 👥 Autor
**Jose Alejandro Madrigal Ruiz** 📧 [alejandromadrigal_1999@outlook.com]  
🔗 [LinkedIn: Jose Alejandro Madrigal Ruiz](www.linkedin.com/in/jose-alejandro-madrigal-ruiz-686126218)  
🐈 [GitHub: @AlejandroMadrigalDev](https://github.com/AlejandroMadrigalDev)