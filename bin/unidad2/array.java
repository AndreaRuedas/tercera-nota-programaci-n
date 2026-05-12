public class array {
     public static void main(String[] args) {
        int[] vector_numeros = new int[10];
        int cuadrado, cubo;
 
        for (int i = 0; i < 10; i++) {
            vector_numeros[i] = (int) (Math.random() * 10) + 1;
        }
 
        for (int i = 0; i < 10; i++) {
            cuadrado = vector_numeros[i] * vector_numeros[i];
            cubo = vector_numeros[i] * vector_numeros[i] * vector_numeros[i];
            System.out.println("Número: " + vector_numeros[i] + " | Cuadrado: " + cuadrado + " | Cubo: " + cubo);
        }
    }
}
