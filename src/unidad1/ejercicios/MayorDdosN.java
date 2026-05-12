public class MayorDdosN {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;
 
        System.out.print("Ingrese el primer número: ");
        num1 = sc.nextDouble();
 
        System.out.print("Ingrese el segundo número: ");
        num2 = sc.nextDouble();
 
        if (num1 > num2) {
            System.out.println("El mayor es: " + num1);
        } else {
            System.out.println("El mayor es: " + num2);
        }
 
        sc.close();
    }
}
