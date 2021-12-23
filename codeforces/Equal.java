import java.util.Scanner;

public class Equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            boolean ans = solve(s);
            if (ans) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean solve(String s) {
        int n = 0;
        int e = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'N') {
                n++;
            } else if (s.charAt(i) == 'E'){
                e++;
            }
        }
        if (n == 0 || e == 0) return true;
        if (n == 1 && e > 0) return false;
        return true;
    }
}
