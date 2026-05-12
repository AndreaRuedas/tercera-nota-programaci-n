public class aumentoSueldo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sueldo, sueldoFinal;
        int antiguedad;
 
        System.out.print("Ingrese el sueldo del operario: ");
        sueldo = sc.nextDouble();
 
        System.out.print("Ingrese los años de antigüedad: ");
        antiguedad = sc.nextInt();
 
        if (sueldo < 500) {
            if (antiguedad >= 10) {
                sueldoFinal = sueldo + sueldo * 20 / 100;
                System.out.println("Aumento del 20%");
                System.out.println("Sueldo a pagar: " + sueldoFinal);
            } else {
                sueldoFinal = sueldo + sueldo * 5 / 100;
                System.out.println("Aumento del 5%");
                System.out.println("Sueldo a pagar: " + sueldoFinal);
            }
        } else {
            System.out.println("Sueldo sin cambios: " + sueldo);
        }
 
        sc.close();
    }
}
