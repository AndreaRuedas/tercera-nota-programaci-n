package unidad2;

import java.util.Scanner;

public class alumnos {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Declarar vectores para nombres y edades
        String[] nombres = new String[50];
        int[] edades = new int[50];
        int contador = 0;

        
        System.out.println("Ingresa los datos de los alumnos (escribe * para terminar):");

        while (contador < nombres.length) {
            System.out.print("\nNombre: ");
            String nombre = scanner.nextLine();

            // Condición de parada
            if (nombre.equals("*")) {
                break;
            }

            System.out.print("Edad:   ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            nombres[contador] = nombre;
            edades[contador] = edad;
            contador++;
        }

        
        if (contador == 0) {
            System.out.println("\nNo se ingresó ningún alumno.");
        } else {

            
            double suma = 0;
            int indiceMayor = 0;
            int indiceMenor = 0;

            for (int i = 0; i < contador; i++) {
                suma += edades[i];

                if (edades[i] > edades[indiceMayor]) {
                    indiceMayor = i;
                }
                if (edades[i] < edades[indiceMenor]) {
                    indiceMenor = i;
                }
            }

            double media = suma / contador;

            
            System.out.println("\n--- Lista de alumnos ---");
            System.out.println("Nombre           | Edad");
            System.out.println("-----------------|-----");
            for (int i = 0; i < contador; i++) {
                System.out.printf("%-17s| %d%n", nombres[i], edades[i]);
            }

            
            System.out.println("\n--- Resultados ---");
            System.out.printf("Total de alumnos:   %d%n", contador);
            System.out.printf("Edad media:         %.1f años%n", media);
            System.out.printf("Alumno más joven:   %s (%d años)%n", nombres[indiceMenor], edades[indiceMenor]);
            System.out.printf("Alumno más mayor:   %s (%d años)%n", nombres[indiceMayor], edades[indiceMayor]);
        }

        scanner.close();
    }
}
