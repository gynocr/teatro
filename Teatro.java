public class Teatro {
    private final int filas;
    private final int columnas;
    private String[][] sala;
    private int boletos;
    private int boletosVendidos;

    public Teatro(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.sala = new String[filas + 1][columnas + 1];
        this.boletos = 0;
    }

    public void llenarSala() {
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                if (i == 0 && j == 0) sala[i][j] = " ";
                else if (i == 0) sala[i][j] = String.valueOf(j);
                else if (j == 0) sala[i][j] = String.valueOf(i);
                else sala[i][j] = ".";
            }
        }
    }

    public void mostrarSala() {
        System.out.println("Sala de teatro");
        for (String[] asientos : sala) {
            for (int j = 0; j < sala[0].length; j++) {
                System.out.print(asientos[j] + " ");
            }
        }
    }
}