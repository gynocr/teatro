package controller;

import java.util.*;

class teatro {
    private final int fila;
    private final int columna;
    private String[][] sala;
    private int boletos;
    private int boletosVendidos;

    public teatro(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        this.sala = new String[fila][columna];
        this.boletos = 0;
    }

    public void llenarSalaPorDefault() {
        for (int i = 0; i < this.fila; i++) {
            for (int j = 0; j < this.columna; j++) {
                if (i == 0 && j == 0)
                    sala[i][j] = " ";
                else if (i == 0)
                    sala[i][j] = String.valueOf(j);
                else if (j == 0)
                    sala[i][j] = String.valueOf(i);
                else
                    sala[i][j] = "\033[32mV\033[0m ";
            }
        }
    }

    public void imprimirSala() {
        System.out.println("\nSala de teatro\n");
        for (String[] asientos : sala) {
            for (int j = 0; j < sala[0].length; j++) {
                System.out.print(asientos[j] + "  ");
            }
            System.out.println("\n ");
        }
    }

    public boolean verificarButaca(int comprarFila, int comprarColumna) {
        boolean verificar = comprarFila > fila ||
                comprarColumna > columna ||
                comprarFila < 0 ||
                comprarColumna < 0;
        if (verificar) {
            System.out.println("\nLa butaca ingresada no existe\n");
            return false;
        } else if (sala[comprarFila][comprarColumna].equals("X")) {
            System.out.println("\nLa butaca ingresada ya esta ocupada\n");
            return false;
        }
        return true;
    }

    public void comprarBoleto(int comprarFila, int comprarColumna) {
        int precio = 10;
        boletos += 1;
        boletosVendidos += precio;
        sala[comprarFila][comprarColumna] = "X";
        System.out.println("\nPrecio de la compra:\n" + precio);
    }

    public int calcularPrecio(int comprarFila) {
        return (fila * columna <= 65) || (fila / 2 >= comprarFila) ? 10 : 8;
    }

    public int totalIngresos () {
        int boletosVendidos;
        if (fila * columna <= 50) {
            boletosVendidos = 10 * fila * columna;
        } else {
            int precio1 = (fila / 2) * columna;
            int precio2 = (fila - (fila / 2)) * columna;
            boletosVendidos = precio1 + precio2;
        }
        return boletosVendidos;
    }   

    public float porcentajeVentas() {
        int cantidadButacas = fila * columna;
        float porcentaje = (float) boletos / cantidadButacas;
        return porcentaje * 100;
    }

    public void estadisticas() {
        System.out.println("\nNumero de boletos comprados: " + boletos + "\n" +
                "Ingreso actual: " + boletosVendidos + "\n" +
                "Total de ingresos esperados: " + totalIngresos() + "\n");
    }
}