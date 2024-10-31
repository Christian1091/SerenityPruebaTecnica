# Pruebas Funcionales Automatizadas Serenity

## Desarrollo
Desarrollado con:

* [Serenity ](https://github.com/serenity-bdd/serenity-core/releases) de la versión 4.0.1
* JDK versión 17
* Maven
* Cucumber
* Gherkin
* IntelliJ IDEA

## Ejecutar de manera local

* Clonar el repositorio.
* Verificar dependencias en el pom.xml
* Ubicarse en la clase Runner que se encuentra dentro de la carpeta /src/test/java y ejecutar Run Runner

## Funcionalidades

Este proyecto realiza pruebas funcionales automatizadas utilizando Serenity BDD, permite ingresar a la página http://opencart.abstracta.us/ en donde mediante la automatización se va a agregar dos productos del catálago, se va a visualizar los productos en el carrito y posteriormente se ingresará los datos obligatorios y requeridos en el formulario del cliente, luego se completará sección de delivery method, payment method para finalizar culminar con la confirmación de la orden. 

### Acciones Agregar, Listar, Confirmar Orden

Agregrar:

* Se agrega dos productos del catálago Your Store y posteriormente visualizamos en la sección item(s) la cantidad de productos agregados. 

Listar:
* Se ingresa a la opción view cart en donde se va a visualizar los productos agregados desde el catálogo.

Confirmar Orden:
* Se realiza la verificación de los productos agregados, se llena las secciones checkout option, billing details, delivery method, payment method y finalmente se confirma la orden.
