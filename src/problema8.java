import java.util.Scanner;

public class problema8 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("ingresar la cantidad de preguntas: ");
        int cantidaddepreguntas = input.nextInt();
        System.out.print("ingresar la cantidad de respuestas buenas: ");
        int respuestascorrectas = input.nextInt();

        float  promedio =  ( (float)respuestascorrectas/cantidaddepreguntas) * 100f;

        if (promedio >= 90) {
            System.out.println("nivel maximo con: " + (int) promedio);
        } else if (promedio >= 75 && promedio < 90) {
            System.out.println("nivel medio con: " + (int) promedio);
        } else if (promedio >= 50 && promedio < 75) {
            System.out.println("nivel regular con " + (int) promedio);
        } else {
            System.out.println("fuera de nivel con: " + (int) promedio);
        }
        input.close();
    }
}
