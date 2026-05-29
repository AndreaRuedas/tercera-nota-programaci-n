package unidad2;

import java.util.Scanner;

public class sucursale {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numArticulos  = 5;
        int numSucursales = 4;

        // 1. Declarar arreglos
        double[] precios           = new double[numArticulos];         // precio de cada artículo
        int[][] cantidades         = new int[numArticulos][numSucursales]; // cantidades[articulo][sucursal]
        int[] totalArticulo        = new int[numArticulos];            // total vendido por artículo
        double[] recaudacionSucursal = new double[numSucursales];      // recaudación por sucursal

        // 2. Leer precios de los artículos
        System.out.println("=== Ingresa el precio de cada artículo ===");
        for (int a = 0; a < numArticulos; a++) {
            System.out.print("Precio artículo " + (a + 1) + ": $");
            precios[a] = scanner.nextDouble();
        }

        // 3. Leer cantidades vendidas por sucursal
        System.out.println("\n=== Ingresa las cantidades vendidas ===");
        for (int a = 0; a < numArticulos; a++) {
            System.out.println("\nArtículo " + (a + 1) + " (precio: $" + precios[a] + "):");
            for (int s = 0; s < numSucursales; s++) {
                System.out.print("  Sucursal " + (s + 1) + ": ");
                cantidades[a][s] = scanner.nextInt();
            }
        }

        // 4. Calcular totales por artículo
        for (int a = 0; a < numArticulos; a++) {
            for (int s = 0; s < numSucursales; s++) {
                totalArticulo[a] += cantidades[a][s];
            }
        }

        // 5. Calcular recaudación por sucursal
        for (int s = 0; s < numSucursales; s++) {
            for (int a = 0; a < numArticulos; a++) {
                recaudacionSucursal[s] += precios[a] * cantidades[a][s];
            }
        }

        // 6. Calcular recaudación total de la empresa
        double recaudacionTotal = 0;
        for (int s = 0; s < numSucursales; s++) {
            recaudacionTotal += recaudacionSucursal[s];
        }

        // 7. Encontrar sucursal de mayor recaudación
        int indiceMayor = 0;
        for (int s = 1; s < numSucursales; s++) {
            if (recaudacionSucursal[s] > recaudacionSucursal[indiceMayor]) {
                indiceMayor = s;
            }
        }

        // ============ MOSTRAR RESULTADOS ============

        // Tabla general
        System.out.println("\n======= Tabla de Cantidades Vendidas =======");
        System.out.printf("%-12s %10s %10s %10s %10s %10s%n",
                "Artículo", "Sucursal1", "Sucursal2", "Sucursal3", "Sucursal4", "TOTAL");
        System.out.println("-".repeat(65));
        for (int a = 0; a < numArticulos; a++) {
            System.out.printf("Artículo %-3d", (a + 1));
            for (int s = 0; s < numSucursales; s++) {
                System.out.printf("%10d", cantidades[a][s]);
            }
            System.out.printf("%10d%n", totalArticulo[a]);
        }

        // a. Cantidades totales de cada artículo
        System.out.println("\n--- a) Cantidad total vendida por artículo ---");
        for (int a = 0; a < numArticulos; a++) {
            System.out.printf("Artículo %d: %d unidades%n", (a + 1), totalArticulo[a]);
        }

        // b. Cantidad de artículos en sucursal 2
        System.out.println("\n--- b) Cantidad de artículos en Sucursal 2 ---");
        int totalSucursal2 = 0;
        for (int a = 0; a < numArticulos; a++) {
            System.out.printf("  Artículo %d: %d unidades%n", (a + 1), cantidades[a][1]);
            totalSucursal2 += cantidades[a][1];
        }
        System.out.println("  Total sucursal 2: " + totalSucursal2 + " unidades");

        // c. Cantidad del artículo 3 en sucursal 1
        System.out.println("\n--- c) Cantidad del Artículo 3 en Sucursal 1 ---");
        System.out.println("  " + cantidades[2][0] + " unidades");

        // d. Recaudación total de cada sucursal
        System.out.println("\n--- d) Recaudación total por sucursal ---");
        for (int s = 0; s < numSucursales; s++) {
            System.out.printf("  Sucursal %d: $%.2f%n", (s + 1), recaudacionSucursal[s]);
        }

        // e. Recaudación total de la empresa
        System.out.printf("%n--- e) Recaudación total de la empresa ---%n");
        System.out.printf("  $%.2f%n", recaudacionTotal);

        // f. Sucursal de mayor recaudación
        System.out.println("\n--- f) Sucursal de mayor recaudación ---");
        System.out.printf("  🏆 Sucursal %d con $%.2f%n", (indiceMayor + 1), recaudacionSucursal[indiceMayor]);

        scanner.close();
    }
}

