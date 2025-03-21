import java.util.Scanner;
public class problema5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("ingresar el primer numero: ");
        int numero1 = input.nextInt();
        System.out.print("ingrear el segundo numero: ");
        int numero2 = input.nextInt();

        if (numero1 > numero2) {
            System.out.println("el numero mayor es el: " + numero1);
        }else if (numero2 > numero1) {
            System.out.println("el numero mayor es el: " + numero2);
        }else {
            System.out.println("son iguales ");
        }
        input.close();
    }
}
