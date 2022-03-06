# Abstract Factory Pattern

## Introduccion y nombre
Abstract Factory. Creacional

## Intencion
Ofrece una interfaz para la creacion de familias de productos relacionados o dependientes sin especificar las clases concretas a las que pertenecen.

## Tambien conocido como
Factoria Abstracta,kit.

## Solucion
Se debe utilizar este patron cuando:

- La aplicacion debe ser independiente de como se crean, se componen y se representan sus productos.
- Un sistema se debe configurar con una de entre varias familias de productos.
- Una familia de productos relacionados estan hechos para utilizarse juntos (hay que hacer que esto se cumpla)
- Para ofrecer una libreria de clases, mostrando solo sus interfaces y no sus implementaciones.

## Implementacion

Veamos los puntos mas importantes para su implementacion:

- Factorias como singletons: lo ideal es que exista una instancia de FactoryConcreto por familia de productos.
- Definir factorias extensibles: añadiendo un parametro en las operaciones de creacion que indique el tipo de objeto a crear.
- Para crear los productos se usa un Factory Method para cada uno de ellos.
## Ejemplo de Muestra

1. La clase TV, que tiene dos hijas: Plasma y LCD
2. La clase Color, que tiene dos hijas: Amarillo y Azul

Escenario: nuestra empresa se dedica a darle un formato estetico especifico a los televisres LCD y Plasma. Se ha decidido que todos los LCD que saldran al mercado seran azules y los plasmas seran amarillos. Por este motivo se ha decidido realizar el patron Abstract Factory. 