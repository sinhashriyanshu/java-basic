public class Fibonacci {

    public static long fino(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        long a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 10; 
        System.out.println("Fibonacci number at position " + n + " is: " + fino(n));
    }
}
