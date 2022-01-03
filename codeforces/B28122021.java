import java.util.ArrayList;
import java.util.Scanner;

public class B28122021 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            solve();
            if (i < t - 1) System.out.println();
        }
    }

    private static void solve() {
        int n = sc.nextInt();
        if (n == 1) {
            int x = sc.nextInt(); int y = sc.nextInt();
            System.out.println(x + " " + y + " " + x);
            return;
        }
        int[][] set = new int[n][2];
        for (int i = 0; i < n; i++) {
            set[i][0] = sc.nextInt();
            set[i][1] = sc.nextInt();
        }
        int curl = set[0][0]; int curr = set[0][1];
        for (int i = 0; i < n; i++) {
            if (Math.abs(set[i][0] - set[i][1]) > Math.abs(curl - curr)) {
                curr = set[i][1]; curl = set[i][0];
            }
        }
        ArrayList<Integer[]> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Integer[] temp = {set[i][0], set[i][1]};
            nums.add(temp);
        }
        ArrayList<Integer[]> q = new ArrayList<>();
        Integer[] x = {curl, curr};
        q.add(x);
        while (!q.isEmpty()) {
            for (int j = 0; j < nums.size(); j++) {
                if (nums.get(j)[0] == q.get(0)[0] && nums.get(j)[1] == q.get(0)[1]) {
                    nums.remove(j); break;
                }
            }
            int ans = -1;
            if (q.get(0)[0] == q.get(0)[1]) {
                System.out.println(q.get(0)[0] + " " + q.get(0)[0] + " " + q.get(0)[0]);
                for (int j = 0; j < nums.size(); j++) {
                    if (nums.get(j)[0] == q.get(0)[0] && nums.get(j)[1] == q.get(0)[1]) {
                        nums.remove(j); break;
                    }
                }
                q.remove(0);
                continue;
            }
            for (int i = 0; i < nums.size(); i++) {
                curl = q.get(0)[0];
                curr = q.get(0)[1];
                int l = nums.get(i)[0]; int r = nums.get(i)[1];
//                if (l == curl && r == curr) continue;
                if (l == curl) {
                    ans = r + 1;
                    Integer[] temp = {l , r};
                    q.add(temp);
                    for (int j = 0; j < nums.size(); j++) {
                        if (nums.get(j)[0] == l && nums.get(j)[1] == r) {
                            nums.remove(j);
                        }
                    }
                    i--;
                }
                if (r == curr) {
                    ans = l - 1;
                    Integer[] temp = {l , r};
                    q.add(temp);
                    for (int j = 0; j < nums.size(); j++) {
                        if (nums.get(j)[0] == l && nums.get(j)[1] == r) {
                            nums.remove(j);
                        }
                    }
                    i--;
                }
            }
            if (ans != -1) System.out.println(q.get(0)[0] + " " + q.get(0)[1] + " " + ans);
            q.remove(0);
        }
    }
}
