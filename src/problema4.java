import java.util.Scanner;
public class problema4 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("ingresar su salario: ");
        int saldo = input.nextInt();

        if (saldo >= 3000) {
            System.out.println("debe abonar impuesto ");
        } else {
            System.out.println("no debe abonar impuesto");
        }
        input.close();
    }
}
