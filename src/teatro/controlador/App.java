package controller;

public class App {
    static controller.teatro teatro;

    private static void comprarBoleto() {
        boolean flag;
        int comprarFila, comprarColumna;

        do {
            System.out.print("Ingrese la fila: ");
            comprarFila = Integer.parseInt(System.console().readLine());
            System.out.print("Ingrese la columna: ");
            comprarColumna = Integer.parseInt(System.console().readLine());
            flag = teatro.verificarButaca(comprarFila, comprarColumna);
        } while (!flag);
        teatro.comprarBoleto(comprarFila, comprarColumna);
    }

    public static void main(String[] args) {
        int opcion = 0;
        String menu = "\n1. Ver butacas\n2. Comprar boletos\n3. Estadisticas\n4. Salir\n";
        System.out.println(
                "\nSe creara una nueva area de butacas en la sala de teatro por favor ingrese lo siguiente:\n");
        System.out.println("\nIngresar el numero de filas: \n");
        int fila = Integer.parseInt(System.console().readLine());
        System.out.println("\nIngresar el numero de columnas: \n");
        int columna = Integer.parseInt(System.console().readLine());
        teatro = new teatro(13, 18);
        teatro.llenarSalaPorDefault();
        teatro.imprimirSala();

        do {
            System.out.println(menu);
            opcion = Integer.parseInt(System.console().readLine());
            switch (opcion) {
                case 1:
                    teatro.imprimirSala();
                    break;
                case 2:
                    comprarBoleto();
                    break;
                case 3:
                    teatro.estadisticas();
                case 4:
                    break;
                default:
                    System.out.println("\nLa opcion ingresada no es valida\n");
                    break;
            }
        } while (opcion != 4);
    }
}
