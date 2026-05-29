package unidad2;

import java.util.Scanner;

public class NotasAlumno {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Crear array de 5 notas
        double[] notas = new double[5];

        // 2. Leer las notas por teclado
        System.out.println("Ingresa las 5 notas (entre 0 y 10):");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();

            // Validar que la nota esté entre 0 y 10
            if (notas[i] < 0 || notas[i] > 10) {
                System.out.println("⚠ Nota inválida, debe estar entre 0 y 10. Inténtalo de nuevo.");
                i--; // repetir este índice
            }
        }

        // 3. Calcular media, nota más alta y más baja
        double suma = 0;
        double notaMax = notas[0];
        double notaMin = notas[0];

        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];

            if (notas[i] > notaMax) {
                notaMax = notas[i];
            }
            if (notas[i] < notaMin) {
                notaMin = notas[i];
            }
        }

        double media = suma / notas.length;

        // 4. Mostrar todas las notas
        System.out.println("\n--- Notas ingresadas ---");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        // 5. Mostrar resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("Nota media:   " + media);
        System.out.println("Nota más alta: " + notaMax);
        System.out.println("Nota más baja: " + notaMin);

        scanner.close();
    }
}
