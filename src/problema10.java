import java.util.Scanner;

public class problema10 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("ingrese su sueldo: ");
        int sueldo = input.nextInt();
        System.out.print("ingrese los años que lleva trabajando: ");
        int años = input.nextInt();
        float aumento1 = 0.20f;
        float aumento2 = 0.05f;

        if (sueldo <= 500 && años >= 10) {
            float total = sueldo + ( sueldo * aumento1 );
            System.out.println("el total a pagar es de: " + total);
        } else if (sueldo <= 500 && años < 10) {
            float total = sueldo + (sueldo * aumento2 );
            System.out.println("el total a pagar es de: " +  total);
        } else {
            System.out.println("su sueldo es mayor de 500 por lo tanto no se le da aumento");
        }
        input.close();
    }
}
