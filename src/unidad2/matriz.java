package unidad2;

import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Crear la matriz bidimensional de 5x5
        int[][] matriz = new int[5][5];

        // 2. Cargar la matriz con valores del teclado
        System.out.println("=== Ingresa los valores de la matriz 5x5 ===");
        for (int fila = 0; fila < 5; fila++) {
            System.out.println("\nFila " + (fila + 1) + ":");
            for (int col = 0; col < 5; col++) {
                System.out.print("  matriz[" + fila + "][" + col + "]: ");
                matriz[fila][col] = scanner.nextInt();
            }
        }

        // 3. Mostrar la matriz visualmente
        System.out.println("\n=== Matriz cargada ===");
        System.out.println("       Col1  Col2  Col3  Col4  Col5");
        for (int fila = 0; fila < 5; fila++) {
            System.out.print("Fila " + (fila + 1) + ": ");
            for (int col = 0; col < 5; col++) {
                System.out.printf("%5d ", matriz[fila][col]);
            }
            System.out.println();
        }

        // 4. Sumar elementos de cada FILA
        System.out.println("\n=== Suma de cada Fila ===");
        for (int fila = 0; fila < 5; fila++) {
            int sumaFila = 0;
            for (int col = 0; col < 5; col++) {
                sumaFila += matriz[fila][col];
            }
            System.out.println("Suma fila " + (fila + 1) + ": " + sumaFila);
        }

        // 5. Sumar elementos de cada COLUMNA
        System.out.println("\n=== Suma de cada Columna ===");
        for (int col = 0; col < 5; col++) {
            int sumaCol = 0;
            for (int fila = 0; fila < 5; fila++) {
                sumaCol += matriz[fila][col];
            }
            System.out.println("Suma columna " + (col + 1) + ": " + sumaCol);
        }

        scanner.close();
    }
}
