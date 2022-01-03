import java.util.Scanner;

public class C24122021 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < t; i++)  {
            solve();
        }
    }

    private static void solve() {
        int n = sc.nextInt(); sc.nextLine();
        String s = sc.nextLine(); String des = sc.nextLine();
        String[] types = new String[n];
        if (s.equals(des)) {
            System.out.println(0); return;
        }
        int diff = 0;
        for (int i = 0; i < n; ++i) {
            types[i] = "" + s.charAt(i) + des.charAt(i);
            if (s.charAt(i) != des.charAt(i)) diff++;
        }
        
    }
}