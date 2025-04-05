import java.util.Scanner;

public class problema15 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("ingresar el primer nombre: ");
        String name1 = input.nextLine();
        System.out.println("ingresar el segundo nombre: ");
        String name2 = input.nextLine();

        if (name1.compareToIgnoreCase(name2) < 0 ) {
            System.out.println("orden alfabetico ");
            System.out.println(name1);
            System.out.println(name2);
        }else {
            System.out.println("orden alfabetico ");
            System.out.println(name2);
            System.out.println(name1);
        }
        input.close();
    }
}
