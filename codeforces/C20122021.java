import java.util.Scanner;

public class C20122021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong(); long s = sc.nextLong(); boolean f = false;
            String ans = "";
//            if (("" + s).length() == ("" + n).length()) {
//                boolean flag = false;
//                for (int j = ("" + n).length() - 1; j >= 0 ;j--) {
//                    if (s % 10 < n % 10) {
//                        System.out.println(-1);
//                        flag = true;
//                        break;
//                    }
//                }
//                if (flag) continue;
//            }
            while (s > 0) {
                long lastn = n % 10;
                long lasts = s % 10;
                long lastb = (10 + lasts - lastn) % 10;
                if (lastn + lastb == s % 10) {
                    ans = lastb + ans;
                    n /= 10;
                    s /= 10;
                } else if (lastn + lastb == s % 100) {
                    ans = lastb + ans;
                    n /= 10;
                    s /= 100;
                } else {
                    System.out.println(-1);
                    f = true;
                    break;
                }
            }
            if (f) continue;
            if (n != 0) {
                System.out.println(-1);
                continue;
            }
            while (ans.charAt(0) == '0' && ans.length() > 1) {
                ans = ans.substring(1);
            }
            System.out.println(ans);
        }
    }
}
