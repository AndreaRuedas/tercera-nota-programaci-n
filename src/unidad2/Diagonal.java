package unidad2;

public class Diagonal {
    public static void main(String[] args) {

        // 1. Crear la matriz bidimensional de 5x5
        int[][] diagonal = new int[5][5];

        // 2. Cargar la matriz: diagonal = 1, resto = 0
        for (int fila = 0; fila < 5; fila++) {
            for (int col = 0; col < 5; col++) {
                if (fila == col) {
                    diagonal[fila][col] = 1; // elemento de la diagonal
                } else {
                    diagonal[fila][col] = 0; // resto de elementos
                }
            }
        }

        // 3. Mostrar la matriz en pantalla
        System.out.println("=== Matriz Diagonal 5x5 ===\n");
        for (int fila = 0; fila < 5; fila++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(diagonal[fila][col] + "  ");
            }
            System.out.println();
        }
    }
}
