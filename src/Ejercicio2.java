import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingresar su primer numero ");
        int num1 = input.nextInt();
        System.out.println("Ingresar su segundo numero ");
        int num2 = input.nextInt();
        System.out.println("Ingresar su tercer numero ");
        int num3 = input.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("el numero mayor es el " + num1);
         } else if (num2 > num1 && num2 > num3) {
            System.out.println("el numero mayor es el " + num2);

          } else {
            System.out.println("el numero mayor es el " + num3);
           }
        
          input.close();

        } 

    }
