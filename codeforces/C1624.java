import java.util.Arrays;
import java.util.Scanner;

public class C1624  {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println(solve());
        }
    }

    private static String solve() {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        boolean[] all = new boolean[n];
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            int temp = a[i];
            if (temp == 1 && !all[0]) all[i] = true;
            while (temp > 0) {
                while (temp > n) {
                    if (temp % 2 != 0) {
                        temp = (temp - 1) / 2;
                    } else {
                        temp /= 2;
                    }
                }
                if (!all[temp - 1]) {
                    all[temp - 1] = true;
                    break;
                }
                if (temp % 2 != 0) {
                    temp = (temp - 1) / 2;
                } else {
                    temp /= 2;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (!all[i]) {
                return "NO";
            }
        }
        return "YES";
    }
}
