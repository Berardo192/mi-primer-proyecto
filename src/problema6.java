import java.util.Scanner;

public class problema6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ingresar un numero positivo o negativo: ");
        int numero = input.nextInt();

        if (numero < 0) {
            System.out.println("el " + numero + " es un numero negativo ");
        } else if (numero > 0 ) {
            System.out.println("el " + numero + " es un numero positivo ");
        } else {
            System.out.println("el " + numero + " es un numero nulo ");
        }
        input.close();

    }
}
