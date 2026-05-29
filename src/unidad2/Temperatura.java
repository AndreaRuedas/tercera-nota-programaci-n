package unidad2;

import java.util.Scanner;

public class Temperatura {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Declarar vectores para temperaturas mínimas y máximas
        double[] tempMin = new double[5];
        double[] tempMax = new double[5];

        // 2. Leer temperaturas de cada día
        System.out.println("=== Ingresa las temperaturas de los 5 días ===");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nDía " + (i + 1) + ":");
            System.out.print("  Temperatura mínima: ");
            tempMin[i] = scanner.nextDouble();
            System.out.print("  Temperatura máxima: ");
            tempMax[i] = scanner.nextDouble();
        }

        // 3. Temperatura media de cada día
        System.out.println("\n=== Temperatura media de cada día ===");
        for (int i = 0; i < 5; i++) {
            double media = (tempMin[i] + tempMax[i]) / 2;
            System.out.printf("Día %d: %.1f°C%n", (i + 1), media);
        }

        // 4. Días con menos temperatura (mínima más baja)
        double minAbsoluta = tempMin[0];
        for (int i = 1; i < 5; i++) {
            if (tempMin[i] < minAbsoluta) {
                minAbsoluta = tempMin[i];
            }
        }

        System.out.println("\n=== Días con menos temperatura ===");
        System.out.printf("Temperatura mínima registrada: %.1f°C%n", minAbsoluta);
        for (int i = 0; i < 5; i++) {
            if (tempMin[i] == minAbsoluta) {
                System.out.println("Día " + (i + 1) + " con mínima de " + tempMin[i] + "°C");
            }
        }

        // 5. Buscar días cuya temperatura máxima coincide con una temperatura dada
        System.out.print("\n=== Búsqueda por temperatura máxima ===");
        System.out.print("\nIngresa una temperatura máxima a buscar: ");
        double tempBuscada = scanner.nextDouble();

        boolean encontrado = false;
        for (int i = 0; i < 5; i++) {
            if (tempMax[i] == tempBuscada) {
                System.out.println("Día " + (i + 1) + " tiene temperatura máxima de " + tempMax[i] + "°C");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("⚠ Ningún día tiene esa temperatura máxima.");
        }

        scanner.close();
    }
}
