import java.util.*;

public class TriangleOnARectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (long i = 0; i < t; i++) {
            long[] p = new long[2];
            p[0] = sc.nextInt(); p[1] = sc.nextInt(); //0 is x
            long[][][] points = new long[2][2][];
            for (int x = 0; x < 4; x++) {
                int which = 0;
                if (x > 1) which = 1;
                int s = sc.nextInt();
                points[which][(x > 1) ? x - 2 : x] = new long[s];
                for (int z = 0; z < s; z++) {
                    points[which][(x > 1) ? x - 2 : x][z] = sc.nextLong();
                }
            }
            ArrayList<Long> great = new ArrayList<>();
            for (long[][] h: points) {
                for (long[] k: h) {
                    Arrays.sort(k);
                    great.add(k[k.length - 1] - k[0]);
                }
            }
            long max = Collections.max(great);
            ArrayList<Long> ans = new ArrayList<>();
            for (int k = 0; k < great.size(); k++) {
                if (k < 2) {
                    ans.add(great.get(k) * p[1]);
                } else {
                    ans.add(great.get(k) * p[0]);
                }
            }
            System.out.println(Collections.max(ans));
        }
    }
}
