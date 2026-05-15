package unidad1.Ejercicios;
import java.util.Scanner;

public class controlsueldo {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantEmpleados, cantEntre100y300 = 0, cantMayor300 = 0;
        double sueldo, importeTotal = 0;
 
        System.out.print("Ingrese la cantidad de empleados: ");
        cantEmpleados = sc.nextInt();
 
        for (int i = 1; i <= cantEmpleados; i++) {
            System.out.print("Ingrese el sueldo del empleado " + i + ": ");
            sueldo = sc.nextDouble();
 
            importeTotal += sueldo;
 
            if (sueldo > 300) {
                cantMayor300++;
            } else {
                cantEntre100y300++;
            }
        }
 
        System.out.println("Empleados con sueldo entre $100 y $300: " + cantEntre100y300);
        System.out.println("Empleados con sueldo mayor a $300: " + cantMayor300);
        System.out.println("Importe total en sueldos: $" + importeTotal);
 
        sc.close();
    }
}
