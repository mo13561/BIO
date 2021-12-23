import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(is2(sc.nextInt()));
    }
    private static boolean isPrime(long i) {
        if (i == 2) return true;
        if (i == 1 || i == 0 || i % 2 == 0) return false;
        for (int j = 3; j < i; j++) {
            if (i % j == 0) return false;
        }
        return true;
    }
    private static boolean is2(int n) {
        if (n == 1 || n == 2) return true;
        if (n == 0 || n % 2 != 0) return false;
        while (n != 1) {
            if (n % 2 != 0) return false;
            n /= 2;
        }
        return true;
    }
}
