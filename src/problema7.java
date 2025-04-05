import java.util.Scanner;

public class problema7 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("ingresar un numero ");
        int numero = input.nextInt();

        if (numero > 99 && numero < 1000) {
            System.out.println("el " + numero + " es un numero de tres cifras ");
        } else if (numero > 10 && numero < 100) {
            System.out.println("el " + numero + " es un numero de dos cifras ");
        } else if (numero > 0 && numero < 10) {
            System.out.println("el " + numero + " es un numero de una sola cifra ");
        } else {
            System.out.println("error el numero tiene mas de tres cifras ");
        }
        input.close();
    }
}
