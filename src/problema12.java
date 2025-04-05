import java.util.Scanner;

public class problema12 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("ingresar la cantidad de trabajadores o de empleados: ");
        int numerodeempleados = input.nextInt();
        int contador1 = 0;
        int contador2 = 0;
        int acumulador = 0;

        for (int i = 1; i <= numerodeempleados; i++){
            System.out.print("sueldo de empleado " + i + " : ");
            int sueldo = input.nextInt();

            if (sueldo >= 100 && sueldo <= 300) {
                contador1++;
            }else {
                contador2++;
            }
            acumulador += sueldo;
        }
        System.out.println("el numero de empleados que ganan de 100 a 300 son: " + contador1);
        System.out.println("el numero de empleados que ganan mayor de 300 son: " + contador2);
        System.out.println("el gasto total de los empleados son: " + acumulador);
        input.close();

    }
}
