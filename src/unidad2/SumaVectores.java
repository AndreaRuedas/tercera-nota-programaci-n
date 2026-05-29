package unidad2;

import java.util.Scanner;

public class SumaVectores {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Declarar los tres vectores de 5 enteros
        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];

        // 2. Pedir valores para vector1
        System.out.println("--- Ingresa los valores del Vector 1 ---");
        for (int i = 0; i < vector1.length; i++) {
            System.out.print("vector1[" + i + "]: ");
            vector1[i] = scanner.nextInt();
        }

        // 3. Pedir valores para vector2
        System.out.println("\n--- Ingresa los valores del Vector 2 ---");
        for (int i = 0; i < vector2.length; i++) {
            System.out.print("vector2[" + i + "]: ");
            vector2[i] = scanner.nextInt();
        }

        // 4. Calcular vector3 = vector1 + vector2
        for (int i = 0; i < vector3.length; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }

        // 5. Mostrar los tres vectores
        System.out.println("\n--- Resultados ---");
        System.out.println("Pos  | Vector1 | Vector2 | Vector3");
        System.out.println("-----|---------|---------|--------");
        for (int i = 0; i < vector3.length; i++) {
            System.out.println("  " + i + "  |    " + vector1[i] + "    |    " + vector2[i] + "    |    " + vector3[i]);
        }

        scanner.close();
    }
}
