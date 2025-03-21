import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {

        System.out.println("por favor dijitar 3 numeros");
        
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese el numero1");
        int num1 = input.nextInt();
        System.out.println("ingrese el numero2");
        int num2 = input.nextInt();
        System.out.println("ingresar el numero3");
        int num3 = input.nextInt();

        System.out.println("el primero es mayor que el segundo y menor que el tercero " +   (num1 > num2 && num1 < num3));

        input.close();

    }
}
