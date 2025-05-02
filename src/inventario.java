import java.util.ArrayList;
import java.util.Scanner;

public class inventario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("cuantos productos desea ingresar: ");
        int numero = input.nextInt();
        int totalinventario = 0;
        boolean continuar = true;

        String [] nombres1 = new String[numero];
        int [][] matris1 = new int[numero][3];

        int numero2 = 0;
        String [] nombre2 = new String[0];
        int [][] matris2 = new int[0][3];

        ArrayList <String> nombrefinal = new ArrayList<>();
        ArrayList <int[]> matrisfinal = new ArrayList<>();
        
        for(int i =0; i < numero; i++){
            input.nextLine();
            System.out.print("ingresar el nombre del producto: ");
            nombres1[i] = input.nextLine();
            System.out.print("ingresar la cantidad del producto: ");
            matris1[i][0] = input.nextInt();
            System.out.print("ingresar el valor del producto: ");
            matris1[i][1] = input.nextInt();

            matris1[i][2] = (int) matris1[i][0] * matris1[i][1];

            nombrefinal.add(nombres1[i]);
            matrisfinal.add(new int[] { matris1[i][0], matris1[i][1], matris1[i][2]});
        }

        do{
            System.out.println("--- menu principal ---");
            System.out.println("1. Para agregar mas productos");
            System.out.println("2. Para actualizar el inventario");
            System.out.println("3. reporte de inventario ");
            System.out.println("4. Cerrar el programa :P");
            System.out.println("Escoje una opcion ");

            int opcion = input.nextInt();
            input.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Cuantos productos desea agregar: ");
                    numero2 = input.nextInt();

                    nombre2 = new String[numero2];
                    matris2 = new int [numero2][3];

                    for (int j = 0; j < numero2; j++){
                        input.nextLine();
                        System.out.print("ingresar el nombre del producto: ");
                        nombre2 [j] = input.nextLine();
                        System.out.print("ingresar la cantidad del producto: ");
                        matris2[j][0] = input.nextInt();
                        System.out.print("ingresar el precio del producto: ");
                        matris2[j][1] = input.nextInt();

                        matris2[j][2] = (int) matris2[j][0] * matris2[j][1];

                        nombrefinal.add(nombre2[j]);
                        matrisfinal.add(new int[] {matris2[j][0], matris2[j][1], matris2[j][2]}); 
                    }
                    break;
                case 2:
                    System.out.print("nombre del articulo que desea buscar: ");
                    String buscando = input.nextLine();
                    boolean encontrado = false;
                    System.out.println("buscando el producto XD");
                    
                    for(int s = 0; s < nombrefinal.size(); s++){
                        if (nombrefinal.get(s).equalsIgnoreCase(buscando)) {
                            int [] datos = matrisfinal.get(s);
                            System.out.println("producto encontrado: ");
                            System.out.println("el producto es: " + nombrefinal.get(s) + " | cantidad: " + datos[0] + " | precio: " + datos[1] + "| total: " + datos[2]);
                            encontrado = true;
                            
                            System.out.println("--- mini menu ---");
                            System.out.println("1. Si quieres actulizar la cantidad");
                            System.out.println("2. Si quiere actulizar el precio");
                            System.out.println("3. si quieres actulizar las dos cosas XD");
                            System.out.print("Elije una opcion: ");
                            int valor = input.nextInt();
                            input.nextLine();
                            
                            switch (valor) {
                                case 1:
                                    System.out.print("ingrese la nueva cantidad del producto: ");
                                    datos[0] = input.nextInt();
                                    datos[2] = (int) datos[0] * datos[1];
                                    break;
                                case 2:
                                    System.out.print("ingrese el nuevo precio del producto: ");
                                    datos[1] = input.nextInt();
                                    datos[2] = (int)  datos[1] * datos[0];
                                    break;
                                case 3:
                                    System.out.print("ingrese la nueva cantidad del producto: ");
                                    datos [0] = input.nextInt();
                                    System.out.print("ingrese el nuevo precio del producto: ");
                                    datos [1] = input.nextInt();
                                    datos[2] = (int) datos[0] * datos[1];
                                    break;
                            }
                        }
                    }

                    if (!encontrado) {
                        System.out.println("el producto no a sido encontrado intentelo nuevamente :)");
                    }
                    break;
                case 3:
                    System.out.println("inventario :P");
                    for(int m = 0; m < nombrefinal.size(); m++){
                        int[] datos = matrisfinal.get(m);
                        System.out.println("Nombre del producto: " + nombrefinal.get(m) + " | cantidad: " + datos[0] + " | precio: " + datos[1] + " | total: " +  datos[2]);
                    }
                    totalinventario = 0;
                    for(int[] datos : matrisfinal){
                        totalinventario += datos[2];
                     }
                    System.out.println("el valor total del inventario es: " + totalinventario);
                    break;
                case 4:
                    System.out.println("cerrardo el programa chau XD");
                    continuar = false;
                    break; 
            
                default:
                    System.out.print("Numero no valido ingrese nuevamente: ");
                    break;
            }
        } while (continuar);
        input.close();
        
     
    }
}