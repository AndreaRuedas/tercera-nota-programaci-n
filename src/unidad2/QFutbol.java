package unidad2;

import java.util.Scanner;

public class QFutbol {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPartidos = 15;

        // 1. Declarar las dos tablas
        String[][] equipos    = new String[numPartidos][2];  // equipos[partido][0=local, 1=visitante]
        int[][] resultados    = new int[numPartidos][2];      // resultados[partido][0=golesLocal, 1=golesVisitante]
        char[] quiniela       = new char[numPartidos];        // 1=local, X=empate, 2=visitante

        // 2. Leer nombres de equipos y resultados
        System.out.println("=== Ingresa los datos de los 15 partidos ===");
        for (int p = 0; p < numPartidos; p++) {
            System.out.println("\nPartido " + (p + 1) + ":");
            System.out.print("  Equipo local:     ");
            equipos[p][0] = scanner.nextLine();
            System.out.print("  Equipo visitante: ");
            equipos[p][1] = scanner.nextLine();
            System.out.print("  Goles " + equipos[p][0] + ": ");
            resultados[p][0] = scanner.nextInt();
            System.out.print("  Goles " + equipos[p][1] + ": ");
            resultados[p][1] = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            // 3. Calcular resultado quiniela (1, X, 2)
            if (resultados[p][0] > resultados[p][1]) {
                quiniela[p] = '1';  // gana local
            } else if (resultados[p][0] == resultados[p][1]) {
                quiniela[p] = 'X';  // empate
            } else {
                quiniela[p] = '2';  // gana visitante
            }
        }

        // 4. Mostrar tabla de resultados
        System.out.println("\n======= Resultados de la Quiniela =======");
        System.out.printf("%-4s %-18s %-18s %-10s %-8s%n",
                "Nº", "Local", "Visitante", "Resultado", "Signo");
        System.out.println("-".repeat(62));

        int ganaLocal     = 0;
        int empates       = 0;
        int ganaVisitante = 0;

        for (int p = 0; p < numPartidos; p++) {
            System.out.printf("%-4d %-18s %-18s %2d - %-6d %-8c%n",
                    (p + 1),
                    equipos[p][0],
                    equipos[p][1],
                    resultados[p][0],
                    resultados[p][1],
                    quiniela[p]);

            // Contar signos
            if (quiniela[p] == '1') ganaLocal++;
            else if (quiniela[p] == 'X') empates++;
            else ganaVisitante++;
        }

        // 5. Mostrar la quiniela (solo los signos)
        System.out.println("\n======= Combinación de la Quiniela =======");
        System.out.print("Signos: ");
        for (int p = 0; p < numPartidos; p++) {
            System.out.print(quiniela[p] + " ");
        }

        // 6. Mostrar estadísticas
        System.out.println("\n\n======= Estadísticas =======");
        System.out.println("Victorias locales  (1): " + ganaLocal);
        System.out.println("Empates            (X): " + empates);
        System.out.println("Victorias visitante(2): " + ganaVisitante);

        // 7. Equipo con más goles anotados
        String maxEquipo = equipos[0][0];
        int maxGoles = resultados[0][0];
        for (int p = 0; p < numPartidos; p++) {
            if (resultados[p][0] > maxGoles) {
                maxGoles = resultados[p][0];
                maxEquipo = equipos[p][0];
            }
            if (resultados[p][1] > maxGoles) {
                maxGoles = resultados[p][1];
                maxEquipo = equipos[p][1];
            }
        }
        System.out.println("\n🏆 Equipo con más goles: " + maxEquipo + " (" + maxGoles + " goles)");

        scanner.close();
    }
}
