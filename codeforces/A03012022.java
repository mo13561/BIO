import java.util.*;
import java.lang.*;


public class A03012022 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < t; i++) {
            solve();
        }
    }

    private static void solve() {
        int n = sc.nextInt(); int k = sc.nextInt(); int bound = (n % 2 == 0) ? n/2 : (n+1)/2;
        if (k > bound) {
            System.out.println(-1);
            return;
        } else if (n == 1) {
            System.out.println("R"); return;
        }
        char[][] grid = new char[n][n];
        for (int i = 0; i < n; i += 2) {
            if (k > 0) {
                grid[i][i] = 'R';
                k--;
            } else {
                break;
            }
            if (k == 0) break;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 'R') {
                    System.out.print("R");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
