import java.util.Scanner;

public class WAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n1 = sc.nextInt(); long n2 = sc.nextInt();
            String s1 = "" + n1; String s2 = "" + n2;
            String s = "";
            if (s1.length() > s2.length()) {
                int p = s1.length() - 1;
                for (int j = s2.length() - 1; j >= 0; j--) {
                    int n = (Integer.parseInt(s2.charAt(j) + "") + Integer.parseInt(s1.charAt(p) + ""));
                    s = n + "" + s;
                    p--;
                }
                s = s1.substring(0, p + 1) + s;
            } else {
                int p = s2.length() - 1;
                for (int j = s1.length() - 1; j >= 0; j--) {
                    int n = (Integer.parseInt(s2.charAt(p) + "") + Integer.parseInt(s1.charAt(j) + ""));
                    s = n + "" + s;
                    p--;
                }
                s = s2.substring(0, p + 1) + s;
            }
            System.out.println(s);
        }
    }
}
