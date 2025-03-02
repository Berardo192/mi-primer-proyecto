import java.util.Scanner;

public class entradaScaner {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = input.nextLine();
        System.out.print("Ingrese su edad: ");
        byte edad = input.nextByte();
        System.out.print("Ingrese su altura: ");
        float altura = input.nextFloat();

        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años " + altura + " metros esta es tu altura. ");

        input.close();
    }
    
}
