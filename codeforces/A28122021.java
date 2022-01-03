import java.util.Scanner;

public class A28122021 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            solve();
        }
    }

    private static void solve() {
        int n = sc.nextInt() - 1; int m = sc.nextInt() - 1; int rb = sc.nextInt(); int cb = sc.nextInt(); int rd = sc.nextInt(); int cd = sc.nextInt();
        if (rb < rd && cb < cd) {
            System.out.println(Math.min(rd - rb, cd - cb));
            return;
        }
//        if (cb > cd && rb < rd) {
//            int ans = rd - rb;//maybe deal with c
//            System.out.println(ans);
//            return;
//        }
        int[][] g = new int[n + 1][m + 1];
        boolean flag = !(rb == rd || cb == cd);
        int rchange = 1; int cchange = 1; int ans = 0;
        while (flag) {
            if (rb == n + 1) {
                rchange = -1;
            }
            if (cb == m + 1) {
                cchange = -1;
            }
            rb += rchange; cb += cchange;
            if (rb == rd || cb == cd) flag = false;
            ans++;
        }
        System.out.println(ans);
    }
}