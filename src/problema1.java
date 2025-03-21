import java.util.Scanner;

public class problema1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ingresa un numero");
        float num1 = input.nextFloat();
        System.out.print("ingresa un numero");
        float num2 = input.nextFloat();

        if (num1 > num2) {
            System.out.print("la suma es : " + (int) (num1 + num2));
            System.out.print("la resta es : " + (int) (num1 - num2));
        } else if (num1 < num2) {
            System.out.print("el producto es: " + (int) (num1 * num2));
            System.out.print("la division es: "+  (num1 / num2));
        } else {
            System.out.println("los numeros son iguales ");
        }
        input.close();
    }
}
