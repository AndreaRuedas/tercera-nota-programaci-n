package unidad2;

import java.util.Scanner;

public class trasport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Definir número de conductores y días
        int numConductores = 3;
        int diasSemana = 7;
        String[] diasNombre = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        // 2. Declarar los arreglos
        String[] nombre    = new String[numConductores];      // vector de nombres
        double[][] kms     = new double[numConductores][diasSemana]; // tabla de km por día
        double[] total_kms = new double[numConductores];      // vector de km totales

        // 3. Leer nombres y kilómetros de cada conductor
        for (int c = 0; c < numConductores; c++) {
            System.out.println("\n=== Conductor " + (c + 1) + " ===");
            System.out.print("Nombre: ");
            nombre[c] = scanner.nextLine();

            System.out.println("Kilómetros por día:");
            for (int d = 0; d < diasSemana; d++) {
                System.out.print("  " + diasNombre[d] + ": ");
                kms[c][d] = scanner.nextDouble();
            }
            scanner.nextLine(); // limpiar buffer
        }

        // 4. Calcular total de km por conductor
        for (int c = 0; c < numConductores; c++) {
            total_kms[c] = 0;
            for (int d = 0; d < diasSemana; d++) {
                total_kms[c] += kms[c][d];
            }
        }

        // 5. Mostrar tabla detallada por conductor
        System.out.println("\n======= Reporte Semanal de Conductores =======");
        System.out.printf("%-15s", "Conductor");
        for (String dia : diasNombre) {
            System.out.printf("%10s", dia);
        }
        System.out.printf("%10s%n", "TOTAL");
        System.out.println("=".repeat(90));

        for (int c = 0; c < numConductores; c++) {
            System.out.printf("%-15s", nombre[c]);
            for (int d = 0; d < diasSemana; d++) {
                System.out.printf("%10.1f", kms[c][d]);
            }
            System.out.printf("%10.1f km%n", total_kms[c]);
        }

        // 6. Mostrar resumen final
        System.out.println("\n======= Resumen Final =======");
        System.out.printf("%-15s %s%n", "Conductor", "Km Totales");
        System.out.println("-".repeat(30));
        for (int c = 0; c < numConductores; c++) {
            System.out.printf("%-15s %.1f km%n", nombre[c], total_kms[c]);
        }

        // 7. Conductor con más y menos km
        int indiceMayor = 0;
        int indiceMenor = 0;
        for (int c = 1; c < numConductores; c++) {
            if (total_kms[c] > total_kms[indiceMayor]) indiceMayor = c;
            if (total_kms[c] < total_kms[indiceMenor]) indiceMenor = c;
        }

        System.out.println("\n--- Destacados de la semana ---");
        System.out.printf("🏆 Más km recorridos: %s (%.1f km)%n", nombre[indiceMayor], total_kms[indiceMayor]);
        System.out.printf("🔻 Menos km recorridos: %s (%.1f km)%n", nombre[indiceMenor], total_kms[indiceMenor]);

        scanner.close();
    }
}
