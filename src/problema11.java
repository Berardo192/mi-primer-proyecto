import java.util.Scanner;

public class problema11 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int contador1 = 0;
        int contador2 = 0;

        for(int i = 1 ; i <= 10 ; i++){
            System.out.print("ingresar la nota " + i + " : ");
            float nota = input.nextFloat();
    
            if (nota >= 7) {
                contador1++;
            }else {
                contador2++;
            }
        }
        System.out.println("notas mayores de 7 fueron: " + contador1);
        System.out.println("notas menores de 7 fueron: " + contador2);
        input.close();
    
    }
}
