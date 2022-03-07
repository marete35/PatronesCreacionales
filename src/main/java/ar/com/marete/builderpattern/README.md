#Build Pattern

## Introduccion y nombre
Builder. Creacional
Permite la creacion de una variedad de objetos complejos desde un objeto fuente, el cual se compone de una variedad de partes que contribuyen individualmente a la creacion de cada objeto complejo.

##Intencion
Abstrae el proceso de creacion de un objeto complejo, centralizando dicho proceso en un unico punto, de tal forma que el mismo proceso de construccion pueda crear representaciones diferentes.

## Tambien conocido como
Patron constructor o virtual builder

## Solucion
Se debe utilizar este patron cuando sea necesario:

- Independizar el algoritmo de creacion  de un objeto complejo de las partes que constituyen el objeto y como se ensamblan entre ellas.
- Que el proceso de construccion permita distintas representaciones para el objeto construido, de manera dinamica.

## Implementacion
Generalmente un Builder abstracto define las operaciones para construir cada componente que el Director podria solicitar.

El ConcreteBuilder implementa estas operaciones y le otorga la inteligencia necesaria para su creacion.

Para utilizarlo el Director recibe un ContreBuilder. 
