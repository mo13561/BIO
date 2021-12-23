import java.util.Scanner;

public class WSub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong(); long big = sc.nextLong();
            String s1 = "" + n; String bigs = "" + big;
            String s = "";
            if (bigs.length() == s1.length()) {
                boolean flag = false;
                for (int j = s1.length() - 1; j >= 0 ;j--) {
                    if (Long.parseLong("" + bigs.charAt(j)) < Long.parseLong("" + s1.charAt(j))) {
                        System.out.println(-1);
                        flag = true;
                        break;
                    }
                }
                if (flag) continue;
            }
            if (bigs.length() < s1.length()) {
                System.out.println(-1);
                break;
            }
            int p = s1.length() - 1;
            String comp = "" + bigs.charAt(bigs.length() - 1);
            boolean flag = false;
            for (int j = bigs.length() - 1; j >= 0; j--) {
                if (p == -1) {
                    p = j;
                    break;
                }
                if (Long.parseLong(comp) < Long.parseLong("" + s1.charAt(p))) {
                    comp = bigs.charAt(j-1) + comp;
                } else {
                    long x = (Long.parseLong(comp) - Long.parseLong(s1.charAt(p) + ""));
                    if (x > 10) {
                        System.out.println(-1);
                        flag = true;
                        break;
                    }
                    if (!(j == 0 && x == 0)) s = x + s;
                    if (j != 0) comp = "" + bigs.charAt(j-1);
                    p--;
                }
            }
            if (flag) continue;
            s = bigs.substring(0, p + 1) + s;
            System.out.println(s);
        }
    }
}
