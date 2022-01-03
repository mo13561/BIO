import java.util.Scanner;

public class A24122021 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int b = sc.nextInt();
            int[] h = new int[b];
            for (int j = 0; j < b; j++) {
                h[j] = sc.nextInt();
            }
//            boolean e = true;
//            for (int j = 1; j < b; j++) {
//                if (h[j] != h[j - 1]) {
//                    e = false;
//                    break;
//                }
//            }
            int total = 0;
            for (int j : h) {
                total += j;
            }
            if (total % b == 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
//            if (e) {
//                System.out.println(0);
//                continue;
//            }
//            System.out.println(1);
        }
    }
}
