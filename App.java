public class App {

    static Teatro teatro;

    public static void main(String[] args) throws Exception {
        String menu = "\n1.Ver asientos disponibles\n2.Comprar boletos \n3.Estadisticas de la sala \n4.Salir\n";
        System.out.println("Se ha creado una sala de teatro favor ingresar: \n");
        System.out.println("Ingresar filas");
        int filas = Integer.parseInt(System.console().readLine());
        System.out.println("Ingresar columnas");
        int columnas = Integer.parseInt(System.console().readLine());
        teatro = new Teatro(filas, columnas);
        teatro.llenarSala();
        teatro.mostrarSala();
        int opcion = 0;

        do {
            System.out.println(menu);
            opcion = Integer.parseInt(System.console().readLine());
            switch (opcion) {
                case 1:
                    teatro.mostrarSala();
                    break;
                case 2:
                    System.out.println("Ingresar fila");
                    int fila = Integer.parseInt(System.console().readLine());
                    System.out.println("Ingresar columna");
                    int columna = Integer.parseInt(System.console().readLine());
                    teatro.comprarBoletos(fila, columna);
                    teatro.mostrarSala();
                    break;
                case 3:
                    teatro.estadisticas();
                    break;
                case 4:
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    System.out.println("La opcion seleccionada no es valida");
                    break;
            }
        } while (opcion != 4);
    }
}
