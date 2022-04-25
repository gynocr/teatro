# teatro
Un teatro quiere contratarles para elaborar un sistema de reservación de boletos.
Se deben tener las siguientes consideraciones:
- Hay un área preferencial de 10 espacios frente al escenario y se puede reservar el espacio específico.
Tiene un costo de ¢7.000 cada espacio. Puede manejarse con una matriz o un ArrayList.
Hay 25 espacios (con un pasillo en medio, es decir 5 hileras de 5 espacios cada una), de gradería
preferencial en la cual las personas que reservan y compran entrada se van sentando según compran o
reservan. Este comportamiento es en forma de STACK para cada hilera. Tiene un costo de ¢5.500 cada
espacio.
Atrás del teatro, está la gradería general, que tiene espacio para 20 espacios y las personas se van
ubicando según reserven o compren. Este comportamiento es en forma de LINKEDLIST. Tiene un
costo de ¢4.000 cada espacio.
Además:
o Todo se maneja por reserva, y puede existir la posibilidad de que “antes de que vaya a
iniciar la función”, haya localidades llenas.
o Las personas hacen reservaciones y deben llegar al teatro antes a pagar las
reservaciones realizadas para poder entrar al teatro (formalizar reserva).
o Si hay localidades llenas y se quiere “asistir a la localidad”, se entra en una “cola de
espera” que se maneja con la estructura QUEUE.
o Por lo tanto, el sistema permite RESERVAR ENTRADAS y APARTE, mostrar a los que
están en listas de espera. No se precisa hacer nada con la lista de espera.
Realice lo siguiente:
a. Desarrolle el diagrama de clases para la solución de este problema.
b. Haga el desarrollo de la solución utilizando el lenguaje Java, en el cual se incluya:
◙ Un menú principal que permita:
i. Realizar reservación (en cualquierlocalidad)
1. Si no puede entrar en una localidad pues está llena, entrar en la
cola de espera
ii. Mostrar cantidades de reservas por ubicación
iii. Mostrar colas de espera para cada ubicación
iv. Mostrar la ganancia general
v. Mostrar la ganancia por una localidad en específico
vi. Mostrar el teatro de la mejor manera posible.
