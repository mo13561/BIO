import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SqCube {
    public static void main(String[] args) {
        ArrayList<Long> l = new ArrayList<>();
        int n = 1000000000;
        for (long j = 1; j <= (long)Math.sqrt(n); j++) {
            long c = j*j*j;
            long q = j*j;
            if (q > n) break;
            if (!l.contains(c)) {
                if (c == q) {
                    l.add(c);
                    continue;
                } else if( c <= n) {
                    l.add(c);
                }
            }
            if (!l.contains(q) && q <= n) l.add(q);
        }
        l.sort(Comparator.naturalOrder());
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            int j = sc.nextInt();
            int ans = 0;
            long nq = (long)Math.sqrt(j) * (long)Math.sqrt(j);
            long nc = (long)Math.sqrt(j)*(long)Math.sqrt(j)*(long)Math.sqrt(j);
            if (nc > nq && nc <= j) {
                ans = l.indexOf(nc) + 1;
            } else if (nq <= j) {
                ans = l.indexOf(nq) + 1;
            }
            System.out.println(ans);
        }
    }
}
