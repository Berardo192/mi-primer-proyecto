import java.util.Scanner;

public class problema3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("ingresar un numero: ");
        float numero = input.nextFloat();

        if (numero % 1 == 0) {
            if (numero > 0 && numero < 10) {
                System.out.println("el " + (int) numero + " es un numero de una sola cifra ");
            }else if (numero >=10 && numero < 99) {
                System.out.println("el " + (int) numero + " es un numero de dos cifras ");
            }else {
                System.out.println("el numero tiene mas de dos cifras ");
            }
        } else {
            System.out.println("error es un numero flotante (es un numero decimal)");
        }  
        input.close();
    } 
}
