import java.util.Scanner;

public class Promenade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        int[] left = {1, 0};
        int[] right = {0,1};
        int[] ans = new int[2];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) =='L') {
                left[0] += right[0];
                left[1] += right[1];
            } else {
                right[0] += left[0];
                right[1] += left[1];
            }
        }
        ans[0] = left[0] + right[0];
        ans[1] = left[1] + right[1];
        for (int i = 2; i <= ans[1]; i++) {
            if (ans[0] % i == 0 && ans[1] % i == 0) {
                ans[0] /= i;
                ans[1] /= i;
            }
        }
        System.out.println(ans[0] + " / " + ans[1]);
    }
}
