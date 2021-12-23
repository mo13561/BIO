import java.util.Scanner;

public class A20122021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            if (s.length() % 2 != 0) {
                System.out.println("NO");
                continue;
            }
            if (s.length() == 2) {
                if (s.charAt(0) == s.charAt(1)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                continue;
            }
            if (s.substring(0, s.length() / 2).equals(s.substring(s.length()/2, s.length()))) {
                System.out.println("YES");
                continue;
            } else {
                System.out.println("NO");
            }
        }
    }
}
