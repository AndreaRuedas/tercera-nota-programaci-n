package unidad1.Ejercicios;
import java.util.Scanner;

public class EjercicioClaseS09 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantEmpleados;
        double sueldo;
        int cantEntre100Y300 = 0;
        int cantMayor300 = 0;
        double importeTotal = 0;

        System.out.print("Ingrese la cantidad de empleados: ");
        cantEmpleados = sc.nextInt();

        for (int i = 1; i <= cantEmpleados; i++) {
            System.out.print("Ingrese el sueldo: ");
            sueldo = sc.nextDouble();
            importeTotal += sueldo;

            if (sueldo > 300) {
                cantMayor300++;
            } else {
                cantEntre100Y300++;
            }
        }

        System.out.println("Cantidad de empleados que ganan entre $100 y $300: " + cantEntre100Y300);
        System.out.println("Cantidad de empleados que ganan más de $300: " + cantMayor300);
        System.out.println("Importe total de la empresa: $" + importeTotal);

        sc.close();
    }
}
