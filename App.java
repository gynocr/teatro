import java.util.Scanner;

public class App {

    final static scanner = new Scanner(System.in);
    static Teatro teatro;
    public static void main(String[] args) throws Exception {
        String menu = "\n1.Ver asientos disponibles\n2.Comprar boletos \n3.Estadisticas de la sala \n4.Salir\n";
        System.out.println("Se ha creado una sala de teatro favor ingresar: \n");
        System.out.println("Ingresar filas");
        int filas = scanner.nextInt();
        System.out.println("Ingresar columnas");
        int columnas = scanner.nextInt();
        teatro = new Teatro(filas, columnas);
        teatro.llenarSala();
        teatro.mostrarSala();
    }
}
