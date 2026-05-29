package unidad2;

public class Vectorordenado {
    public static void main(String[] args) {

        // 1. Declarar y llenar vector con valores aleatorios (entre 1 y 100)
        int[] vector = new int[10];

        System.out.println("--- Vector original (aleatorio) ---");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100) + 1;
            System.out.print(vector[i] + " ");
        }

        // 2. Ordenar de menor a mayor (Burbuja)
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - 1 - i; j++) {
                if (vector[j] > vector[j + 1]) {
                    // Intercambiar elementos
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }

        // 3. Mostrar vector ordenado
        System.out.println("\n\n--- Vector ordenado (menor a mayor) ---");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
}
