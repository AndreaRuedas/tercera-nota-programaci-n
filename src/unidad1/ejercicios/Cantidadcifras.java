package unidad1.Ejercicios;
import java.util.Scanner;

public class Cantidadcifras {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
 
        System.out.print("Ingrese un número entero positivo: ");
        numero = sc.nextInt();
 
        if (numero < 10) {
            System.out.println("El número tiene 1 cifra");
        } else if (numero < 100) {
            System.out.println("El número tiene 2 cifras");
        } else if (numero <= 999) {
            System.out.println("El número tiene 3 cifras");
        } else {
            System.out.println("Error: el número supera las 3 cifras");
        }
 
        sc.close();
    }
}
