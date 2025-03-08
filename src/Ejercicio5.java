import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresar el numero factorial");
        int num = input.nextInt();

        int factorial =1;
        int i = 1;

        while (i <= num) {
            factorial *= i;
            i++;
        }
        System.out.println("el numero factorial es "+num+ "! y el resultado es "+factorial);
        input.close();
    }
}
