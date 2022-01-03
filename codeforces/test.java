import java.util.Scanner;

public class test {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < t; i++) {
            solve();
        }
    }

    private static void solve() {
        int n = sc.nextInt(); sc.nextLine();
        String s = sc.nextLine();
        if (s.length() == 1) {
            System.out.println(s + s);
            return;
        }
        int cur = s.charAt(0);
        String hold = "";
        String ans = "" + s.charAt(0);
        boolean it = false;
        for (int i = 1; i < s.length(); i++) {
            int x = s.charAt(i);
            if (cur > x) {
                ans += s.charAt(i);
                cur = s.charAt(i);
                it = true;
            } else if (cur == x && it) {
                hold += s.charAt(i);
            } else if (cur < x && it) {
                ans += hold;
                break;
            } else {
                break;
            }
        }
        int sz = ans.length();
        for (int i = sz - 1; i >= 0; i--) {
            ans += ans.charAt(i);
        }
        System.out.println(ans);
    }
}