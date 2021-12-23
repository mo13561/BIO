import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NewYearsProblemD {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < t; i++) {
            solve();
        }
    }

    private static void solve() {
        int m = sc.nextInt(); int n = sc.nextInt(); long[][] g = new long[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                g[i][j] = sc.nextLong();
            }
        }
        long high = 1000000000; long min = 0;
        while (min <= high) {
            long mid = ((high + min + 1) / 2);
            if (compute(mid, m, n, g)) {
                min = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(min);
    }

    private static boolean compute(long mid, int m, int n, long[][] g) {
        Set<Integer> set = new HashSet<>();
        boolean shop = false; boolean pair = false;
        for (int j = 0; j < n; j++) {
            shop = false;
            for (int i = 0; i < m; i++) {
                if (g[i][j] > mid) {
                    shop = true;
                    if (set.contains(i)) {
                        pair = true;
                    }
                    set.add(i);
                }
            }
            if (!shop) break;
        }
        return shop && pair;
    }
}
