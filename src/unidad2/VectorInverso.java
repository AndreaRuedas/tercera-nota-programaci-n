package unidad2;

import java.util.Scanner;

public class VectorInverso {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Crear el vector original de 5 elementos
        String[] vector = new String[5];

        // 2. Leer los datos por teclado
        System.out.println("Ingresa 5 palabras:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextLine();
        }

        // 3. Copiar en orden inverso a otro vector
        String[] vectorInverso = new String[5];
        for (int i = 0; i < vector.length; i++) {
            vectorInverso[i] = vector[vector.length - 1 - i];
        }

        // 4. Mostrar el vector inverso
        System.out.println("\nVector en orden inverso:");
        for (int i = 0; i < vectorInverso.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + vectorInverso[i]);
        }

        scanner.close();
    }

}
