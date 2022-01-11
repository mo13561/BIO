import java.util.Scanner;

public class B03012022 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            solve();
        }
    }

    private static void solve() {
        int n = sc.nextInt();
        int g = 0; int l = 0; int cost = 0; int gcost = 0; int lcost = 0;
        for (int i = 0; i < n; i++) {
            int newl = sc.nextInt(); int newg = sc.nextInt(); int c = sc.nextInt();
            if (cost == 0) {
                cost = c;
                l = newl; g = newg; lcost = cost; gcost = cost;
                System.out.println(cost); continue;
            }
            if (newg < g && newl > l) {
                System.out.println(cost);
            } else if (newg > g && newl >= l) {
                    cost += c;
                    gcost = c;
                    if (l == newl) {
                        cost = cost - lcost + c;
                    }
                    lcost = newl == l ? Math.min(gcost, lcost) : lcost;
                    g = newg;
                System.out.println(cost);
            } else if (newg > g && newl < l) {
                cost = c; g = newg; l = newl; gcost = cost; lcost = cost;
                System.out.println(cost);
            } else if (newl < l && newg <= g) {
                cost += c; lcost = c;
                if (g == newg) {
                    cost = cost - gcost + c;
                }
                gcost = newg == g ? Math.min(gcost, lcost) : gcost;
                l = newl;
                System.out.println(cost);
            } else if (newg == g && newl == l) {
                if (c < cost) {
                    cost = c; gcost = c; lcost = c;
                }
                System.out.println(cost);
            }
        }
    }
}
