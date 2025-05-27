import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class LaberintoUniversitario {

    public static void main(String[] args) {
        int[][] laberinto = generarMatrizAleatoria(5); // Matriz 5x5 con valores de 1 a 9
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        System.out.println("=== LABERINTO UNIVERSITARIO ===");
        mostrarMatriz(laberinto);

        do {
            mostrarMenu();
            try {
                System.out.print("Seleccione una opción (1-5): ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1 -> System.out.println("Pares mayores a 4: " + contarParesMayoresA4(laberinto));
                    case 2 -> System.out.println("Promedio de impares: " + calcularPromedioImpares(laberinto));
                    case 3 -> sumarFilas(laberinto);
                    case 4 -> encontrarPosicionMayor(laberinto);
                    case 5 -> System.out.println("¡Gracias por explorar el laberinto! Hasta pronto.");
                    default -> System.out.println("Opción inválida. Elija entre 1 y 5.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                scanner.nextLine(); // limpiar entrada inválida
            }

        } while (opcion != 5);

        scanner.close();
    }

    // Método para mostrar la matriz
    public static void mostrarMatriz(int[][] matriz) {
        System.out.println("Matriz generada:");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Método que imprime el menú
    public static void mostrarMenu() {
        System.out.println("""
        === MENÚ DEL LABERINTO ===
        1. Contar números pares mayores a 4. ⚡
        2. Calcular el promedio de números impares. 🎯
        3. Calcular la suma de cada fila. 🧮
        4. BONUS: Mostrar la posición del número más alto. 👑
        5. Salir.
        """);
    }

    // Método para generar matriz aleatoria
    public static int[][] generarMatrizAleatoria(int tamaño) {
        Random random = new Random();
        int[][] matriz = new int[tamaño][tamaño];
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                matriz[i][j] = random.nextInt(9) + 1;
            }
        }
        return matriz;
    }

    // Método que cuenta pares > 4
    public static int contarParesMayoresA4(int[][] matriz) {
        int contador = 0;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                if (valor % 2 == 0 && valor > 4) {
                    contador++;
                }
            }
        }
        return contador;
    }

    // Método que calcula promedio de impares
    public static double calcularPromedioImpares(int[][] matriz) {
        int suma = 0, cantidad = 0;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                if (valor % 2 != 0) {
                    suma += valor;
                    cantidad++;
                }
            }
        }
        return cantidad == 0 ? 0 : (double) suma / cantidad;
    }

    // Método que suma los valores de cada fila
    public static void sumarFilas(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            int suma = 0;
            for (int valor : matriz[i]) {
                suma += valor;
            }
            System.out.println("Suma de la fila " + (i + 1) + ": " + suma);
        }
    }

    // Método que encuentra la posición del número más alto
    public static void encontrarPosicionMayor(int[][] matriz) {
        int max = matriz[0][0];
        int filaMax = 0;
        int colMax = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    filaMax = i;
                    colMax = j;
                }
            }
        }
        System.out.println("Número más alto: " + max + " en posición [" + filaMax + "][" + colMax + "]");
    }
}
