public class operadoreslogicos {
    public static void main(String[] args) {
        
        byte a = 10;
        byte b = 5;
        byte c = 20;

        System.out.println("a es: " + a + ", b es: " + b + ", c es: " + c);
        System.out.println("a es mayor que b y b es menor que c  " + (a > b && b < c ));
        System.out.println("a es menor b || b mayor que c" + (a < b || b > c));
        System.out.println("! (a > b)" + !(a > b));
    }
}
