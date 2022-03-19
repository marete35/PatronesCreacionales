# Factory Method Pattern

## Introduccion y nombre
Factory Method. Creacional. Libera al desarrollador sobre la forma correcta de crear objetos.

## Intencion
Define la interfaz de creacion de un cierto tipo de objeto, permitiendo que las subclases decidan que clase concreta necesitan instancias.

## Tambien conocido como
Virtual Constructor, Metodo de Factoria

## Solucion
Este patron debe ser utilizado cuando:
- Una clase no puede anticipar el tipo de objeto que debe crear y quiere que sus subclases especifiquen dichos objetos.
- Hay clases que delegan responsabilidades en una o varias subclases.
- Una aplicacion es grande y compleja y posee muchos patrones creacionales.

## Implementacion
Dificultades, tecnicas y trucos a tener en cuenta al aplicar el PD.

Implementacion de la clase Creator

- El metodo factoria es abstracto
- El metodo factoria proporciona una implementacion por defecto

Permite extensibilidad: se pone la creacion de objetos en una operacion separada por si el usuario quiere cambiarla. 

