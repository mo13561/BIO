import java.util.ArrayList;
import java.util.Scanner;

public class IHate1111 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt(); int[] x = new int[t];
//        int max = 1;
        for (int i = 0; i < t; i++) {
            x[i] = sc.nextInt();
//            max = Math.max(max, x[i] + 1);
        }
////        boolean[] dp = new boolean[max];
//        ArrayList<Integer> d = new ArrayList<>();
//        int[] cases = {11, 111};
//        for (int i : cases) {
//            if (i <= max) d.add(i);
//        }
//        for (int i = 22; i < max; i++) {
//            for (int j : cases) {
//                if (j > i) break;
//                if (d.contains(i-j)) {
//                    d.add(i);
//                    break;
//                }
//            }
//        }
//        for (int i : x) {
//            if (d.contains(i)) {
//                System.out.println("YES");
//            } else {
//                System.out.println("NO");
//            }
//        }
        for (int i : x) {
            for (int j = 10; j >= 0; j--) {
                if (i % 11 == 0) {
                    System.out.println("YES");
                    break;
                }
                i -= 111;
                if (i < 0 || j ==0) {
                    System.out.println("NO");
                    break;
                }
            }
        }
    }
}
