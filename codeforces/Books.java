import java.util.Arrays;
import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int t = sc.nextInt();
        int[] books = new int[n];
        for (int i = 0; i < n; i++) {
            books[i] = sc.nextInt();
        }
        int ans = 0;
        int last = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
//            while (last < n && sum + books[last] <= t) {
//                sum += books[last];
//                last++;
//            }
            for (int j = last; j < n && sum + books[last] <= t; j++) {
                sum += books[last];
                last++;
            }
            ans = Math.max(ans, last - i);
            sum -= books[i];
        }
        System.out.println(ans);
    }
}