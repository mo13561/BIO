import java.util.Arrays;
import java.util.Scanner;
//this version excceeds time limit as it does not use bitwise operations and pre-computation
public class B24122021try {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int l = sc.nextInt(); int u = sc.nextInt();
            if (l == u) {
                System.out.println(0); continue;
            }
            int[] n = new int[u-l+1];
            for (int j = l; j <= u; j++) {
                n[j-l] = j;
            }
            String[] s = new String[n.length];
            for (int j = 0; j < n.length; j++) {
                s[j] = Integer.toBinaryString(n[j]);
                String temp = "";
                for (int k = s[j].length() - 1; k >= 0; k--) {
                    temp += s[j].charAt(k);
                }
                s[j] = temp;
            }
            int high = 0;
            for (String j : s) {
                if (j.length() > high) high = j.length();
            }
            for (int j = 0; j < s.length; j++) {
                while (s[j].length() < high) {
                    s[j] = s[j] + "0";
                }
            }
            int[] ans = new int[high];
            for (int j = 0; j < high; j++)  {
                for (int k = 0; k < s.length; k++) {
                    if (s[k].charAt(j) == '0') ans[j]++;
                }
            }
            Arrays.sort(ans);
            System.out.println(ans[0]);
        }
    }
}
