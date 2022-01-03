import java.util.ArrayList;
import java.util.Scanner;

public class B29122021 {
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
            System.out.println(s + "" + s);
        } else if (s.charAt(0) == s.charAt(1)||(int)s.charAt(1) > (int)s.charAt(0)) {
            System.out.println(s.charAt(0) + "" + s.charAt(0));
        } else {
            ArrayList<Character> ans = new ArrayList<>();
            ans.add(s.charAt(0));
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) <= s.charAt(i - 1)) {
                    ans.add(s.charAt(i));
                } else {
                    break;
                }
            }
            for (char i : ans) {
                System.out.print(i);
            }
            for (int i = ans.size() - 1; i >= 0; i--) {
                System.out.print(ans.get(i));
            }
            System.out.println();
        }
    }
}