import java.sql.SQLOutput;
import java.util.Scanner;

public class B24122021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int l = sc.nextInt(); int h = sc.nextInt();
            long ans = h - l + 1;
            for (int j = 0; j < 30; j++) {
                long hset = (long) ((h + 1) >> (j + 1)) << j;
                if ((((h + 1) >> j) & 1) == 1)
                    hset += (h + 1) & ((1 << j) - 1);
                long lset = (long) (l >> (j + 1)) << j;
                if (((l >> j) & 1) == 1)
                    lset += l & ((1 << j) - 1);
                ans = Math.min(ans, (h - l + 1) - (hset - lset));//min between ans and number of numbers minus number of ones that  have 1 in that bit to give the minimum number of 0s since it is binary
            }
            System.out.println(ans);
        }
    }
}

