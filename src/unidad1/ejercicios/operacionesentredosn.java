public class Operacionesentredosn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, suma, diferencia, producto, division;
 
        System.out.print("Ingrese el primer número: ");
        num1 = sc.nextDouble();
 
        System.out.print("Ingrese el segundo número: ");
        num2 = sc.nextDouble();
 
        if (num1 > num2) {
            suma = num1 + num2;
            diferencia = num1 - num2;
            System.out.println("Suma: " + suma);
            System.out.println("Diferencia: " + diferencia);
        } else {
            producto = num1 * num2;
            division = num1 / num2;
            System.out.println("Producto: " + producto);
            System.out.println("División: " + division);
        }
 
        sc.close();
    }
}
