public class nivelPostulante {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPreguntas, preguntasCorrectas;
        double porcentaje;
 
        System.out.print("Ingrese la cantidad total de preguntas: ");
        totalPreguntas = sc.nextInt();
 
        System.out.print("Ingrese la cantidad de preguntas correctas: ");
        preguntasCorrectas = sc.nextInt();
 
        porcentaje = (preguntasCorrectas * 100.0) / totalPreguntas;
 
        if (porcentaje >= 90) {
            System.out.println("Nivel máximo");
        } else if (porcentaje >= 75) {
            System.out.println("Nivel medio");
        } else if (porcentaje >= 50) {
            System.out.println("Nivel regular");
        } else {
            System.out.println("Fuera de nivel");
        }
 
        System.out.println("Porcentaje obtenido: " + porcentaje + "%");
 
        sc.close();
    }
}
