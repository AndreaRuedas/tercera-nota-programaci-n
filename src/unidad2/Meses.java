package unidad2;

import java.util.Scanner;

public class Meses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Vectores con nombres y días de cada mes
        String[] nombresMeses = {
            "Enero", "Febrero", "Marzo", "Abril",
            "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        int[] diasMeses = {
            31, 28, 31, 30,
            31, 30, 31, 31,
            30, 31, 30, 31
        };

        // 2. Pedir el número de mes al usuario
        System.out.print("Ingresa el número del mes (1-12): ");
        int mes = scanner.nextInt();

        // 3. Validar que el mes esté entre 1 y 12
        if (mes < 1 || mes > 12) {
            System.out.println("⚠ Número de mes inválido. Debe estar entre 1 y 12.");
        } else {
            // 4. Mostrar nombre y días (índice = mes - 1)
            System.out.println("\n--- Información del mes ---");
            System.out.println("Mes:            " + nombresMeses[mes - 1]);
            System.out.println("Número de días: " + diasMeses[mes - 1]);
        }

        scanner.close();
    }
}