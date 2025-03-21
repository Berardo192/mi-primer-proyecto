import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("ingresar un numero ");
        int num = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        input.close();
    }
}
