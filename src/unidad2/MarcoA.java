package unidad2;

public class MarcoA {
     public static void main(String[] args) {

        // 1. Crear la matriz bidimensional de 5x15
        int[][] marco = new int[5][15];

        // 2. Cargar la matriz: borde = 1, interior = 0
        for (int fila = 0; fila < 5; fila++) {
            for (int col = 0; col < 15; col++) {

                // Es borde si está en primera o última fila
                // o en primera o última columna
                if (fila == 0 || fila == 4 || col == 0 || col == 14) {
                    marco[fila][col] = 1;
                } else {
                    marco[fila][col] = 0;
                }
            }
        }

        // 3. Mostrar la matriz en pantalla
        System.out.println("=== Matriz Marco 5x15 ===\n");
        for (int fila = 0; fila < 5; fila++) {
            for (int col = 0; col < 15; col++) {
                System.out.print(marco[fila][col] + " ");
            }
            System.out.println();
        }
    }
}
