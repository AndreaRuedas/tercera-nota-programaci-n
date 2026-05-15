package unidad1.Ejercicios;
import java.util.Scanner;

public class conteoNotas {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        int cantAprobados = 0, cantReprobados = 0;
 
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese la nota del alumno " + i + ": ");
            nota = sc.nextDouble();
 
            if (nota >= 7) {
                cantAprobados++;
            } else {
                cantReprobados++;
            }
        }
 
        System.out.println("Alumnos con nota >= 7: " + cantAprobados);
        System.out.println("Alumnos con nota < 7: " + cantReprobados);
 
        sc.close();
    }
}
