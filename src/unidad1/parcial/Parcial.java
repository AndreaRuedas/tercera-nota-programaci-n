package unidad1.parcial;

import java.util.Scanner;

public class Parcial {
    public static void main(String[] args) {
       {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese el valor de la compra: ");
        double compra = sc.nextDouble();

        if (compra < 0) {
            System.out.println("Dato inválido.");
            return;
        }

        double descuento = 0;

        if (compra < 50000) {
            descuento = 0;
        } else if (compra <= 99999) {
            descuento = 0.05;
        } else if (compra <= 200000) {
            descuento = 0.10;
        } else {
            descuento = 0.15;
        }

        double valorDescuento = compra * descuento;
        double total = compra - valorDescuento;

        System.out.println("\n--- Resultado ---");
        System.out.println("Cliente: " + nombre);
        System.out.println("Valor de compra: " + compra);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Valor descontado: " + valorDescuento);
        System.out.println("Total a pagar: " + total);
    }
}
    }
