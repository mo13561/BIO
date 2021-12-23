import java.util.*;

public class TwoButtons {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(); int m = sc.nextInt(); int count = 0;
        while (m != n) {
            if (m < n) {
                count += n - m;
                m += n - m;
            } else {
                if (m % 2 == 0) {
                    m /= 2;
                    count++;
                } else {
                    m = ++m / 2;
                    count += 2;
                }
            }
        }
        System.out.println(count);
    }
}
