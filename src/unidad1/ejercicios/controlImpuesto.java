package unidad1.Ejercicios;
import java.util.Scanner;

public class controlImpuesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sueldo;
 
        System.out.print("Ingrese el sueldo de la persona: ");
        sueldo = sc.nextDouble();
 
        if (sueldo > 3000) {
            System.out.println("Debe abonar impuestos");
        }
 
        sc.close();
    }
}
