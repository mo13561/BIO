import java.util.ArrayList;
import java.util.Scanner;

public class ModernArt {
    static ArrayList<char[]> all = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt(); int d = sc.nextInt(); long n = sc.nextLong();
        String s = solve(a, b, c, d, n);
        System.out.println(s);
    }

    private static String solve(int a, int b, int c, int d, long n) {
        if (a > 0) {
            long p = findAll(a - 1, b, c, d);
            if (p >= n) {
                return 'A' + solve(a - 1, b, c, d, n);
            }
            n -= p;
        }
        if (b > 0) {
            long p = findAll(a, b - 1, c, d);
            if (p >= n) {
                return 'B' + solve(a,b - 1, c, d, n);
            }
            n -= p;
        }
        if (c > 0) {
            long p = findAll(a, b, c - 1, d);
            if (p >= n) {
                return 'C' + solve(a,b,c - 1,d, n);
            }
            n -= p;
        }
        return (a + b + c + d == 0) ? "" : 'D' + solve(a,b,c,d - 1, n);
    }

    private static long findAll(int a, int b, int c, int d) {
        return Math.floorDiv(factorial(a + b + c + d), factorial(a) * factorial(b) * factorial(c) * factorial(d));
    }

    public static long factorial(long n) {
        if (n < 2) {
            return 1;
        }
        return (n == 2) ? 2 : n * factorial(n - 1);
    }

}
