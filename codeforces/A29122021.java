import java.util.ArrayList;
import java.util.Scanner;

public class A29122021 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            solve();
        }
    }

    private static void solve() {
        int n = sc.nextInt();
        int[] types = new int[101];
        boolean check = false;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            types[Math.abs(x)]++;
            if (x != 0) check = true;
        }
        if (!check) {
            System.out.println(1);
            return;
        }
        if (n == 1) {
            System.out.println(1);
            return;
        }
        int ans = 0;
        if (types[0] != 0) ans++;
        for (int i = 1; i < types.length; i++) {
            if (types[i] >= 2) {
                ans += 2;
            } else if (types[i] == 1) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
