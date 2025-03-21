import java.util.Scanner;

public class problema2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ingresar la primera nota: ");
        float nota1 = input.nextFloat();
        System.out.print("ingresar la segunda nota: ");
        float nota2 = input.nextFloat();
        System.out.print("ingresar la tercera nota: ");
        float nota3 = input.nextFloat();

        float promedio = (nota1 + nota2 + nota3) /3;
        System.out.println("su promedio es de: "+ promedio);

        if (promedio >= 7) {
            System.out.println("promocionado ");
        }else {
            System.out.println("no promocionado ");
        }

        input.close();
    }
}
