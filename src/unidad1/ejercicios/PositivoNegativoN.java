package unidad1.Ejercicios;
import java.util.Scanner;

public class PositivoNegativoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
 
        System.out.print("Ingrese un número entero: ");
        numero = sc.nextInt();
 
        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es nulo");
        }
 
        sc.close();
    }
}
