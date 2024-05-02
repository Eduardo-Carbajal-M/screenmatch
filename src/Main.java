import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenio a la inmersion en Java");
        //System.out.println("Pelicula Matrix");
        // Declaracion de variables
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor pelicula del fin del milenio
                """;
        double mediaEvaluacionUsuario = 0;


        System.out.println("Pelicula: " + nombre);
        System.out.println("Año: " + fechaDeLanzamiento);
        System.out.println("Puntuación: " + evaluacion);
        System.out.println("Esta en el plan basico: " + incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de evaluacion de Matrix: " + mediaEvaluacion);

        if (fechaDeLanzamiento > 2023){
            System.out.println("Pelicula popular en el momento");
        } else {
            System.out.println("Pelicula retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darias a Matrix: ");
            double notaDeMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaDeMatrix;
        }
        System.out.println("La media de la pelicula Matrix calculada por el usuario es: " + mediaEvaluacionUsuario / 3);


    }
}