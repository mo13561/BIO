import java.util.Scanner;

public class A1624 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int small = 1111111111; int big = -1;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] > big) big = a[i];
                if (a[i] < small) small = a[i];
            }
            System.out.println((big - small == 0) ? 0 : big - small);
        }
    }
}
