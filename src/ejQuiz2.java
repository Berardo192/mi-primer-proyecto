import java.util.Scanner;

public class ejQuiz2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingresar un numero de inicio");
        int inicio = input.nextInt();
        System.out.println("ingresa el numero de fin");
        int fin = input.nextInt();

        if (inicio>fin) {
            System.out.println("entrada no valida ");
            input.close();
            return;
        }
        boolean encontrado = false;
        
        for (int i =Math.max(2,inicio); i < fin; i++){
            int contadordivisores = 0;
            int primerdivisor = 0;
            int segundodivisor = 0;
            
            for (int j = 2; j <= i; j++){
                if (i % j == 0) {
                    contadordivisores ++;
                    
                    if (contadordivisores == 1) {
                        primerdivisor = j;

                    } else if (contadordivisores == 2) {
                        segundodivisor = j;
                    }else {
                        break;
                    }
                }
            } 
            if (contadordivisores == 2) {
                encontrado = true;
                System.out.println(i + " numero amigo " + primerdivisor + " - " + segundodivisor);
            }
        }
        if (!encontrado) {
            System.out.println("no se encontraron numero amigos ");
        }
        input.close();
        }


    }
