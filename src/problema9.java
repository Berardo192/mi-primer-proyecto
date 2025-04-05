import java.util.Scanner;

public class problema9 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("ingresar la nota 1: ");
        float nota1 = input.nextFloat();
        System.out.print("ingresar la nota 2: ");
        float nota2 = input.nextFloat();
        System.out.print("ingresar la nota 3: ");
        float nota3 = input.nextFloat();

        float promedio = ((float) nota1 + nota2 + nota3) / 3;

        if (promedio >= 7 ) {
            System.out.println("promocionado con un promedio de: " + promedio);
        } else if (promedio >= 4 && promedio < 7) {
            System.out.println("regular con un promedio de: " + promedio );
        } else {
            System.out.println("reprobado con un promedio de: " + promedio);
        }
        input.close();
    }
}
