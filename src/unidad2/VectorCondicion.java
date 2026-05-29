package unidad2;

import java.util.Scanner;

public class VectorCondicion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Declarar vector de 10 enteros
        int[] vector = new int[10];
        int contador = 0; // cuántos números se ingresaron realmente

        // 2. Pedir números hasta llenar el vector o número negativo
        System.out.println("Ingresa hasta 10 números enteros (negativo para parar):");

        while (contador < vector.length) {
            System.out.print("Número " + (contador + 1) + ": ");
            int numero = scanner.nextInt();

            // Si es negativo, detener
            if (numero < 0) {
                System.out.println("Número negativo detectado. Deteniendo...");
                break;
            }

            // Guardar el número en el vector
            vector[contador] = numero;
            contador++;
        }

        // 3. Mostrar solo los elementos ingresados
        System.out.println("\n--- Elementos ingresados (" + contador + " en total) ---");

        if (contador == 0) {
            System.out.println("No se ingresó ningún número.");
        } else {
            for (int i = 0; i < contador; i++) {
                System.out.println("Posición " + (i + 1) + ": " + vector[i]);
            }
        }

        scanner.close();
    }
}
