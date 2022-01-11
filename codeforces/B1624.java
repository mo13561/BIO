import java.util.Scanner;

public class B1624 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long[] n = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
            long a = (2 * n[1]) - n[2];
            long b = n[0] + n[2];
            long c = (2 * n[1]) - n[0];
            System.out.println(((a % n[0] == 0 && a > 0) || ((b % 2 == 0) && b % (2*n[1]) == 0 && b > 0) || (c % n[2] == 0 && c > 0)) ? "YES" : "NO");
        }
    }
}
