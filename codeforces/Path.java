import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;
//half works
public class Path {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int l = sc.nextInt(); int s = sc.nextInt(); int e = sc.nextInt(); int count = 0;
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(s);
        ArrayList<Integer> p = new ArrayList<>(); p.add(2);
        ArrayList<Integer> counter = new ArrayList<>(); counter.add(1);
        for (int i = 3; i <= l; i += 2) {
            if (isPrime(i)) p.add(i);
        }
        boolean[] vis = new boolean[p.size()];
        vis[0] = true;
        while (!q.isEmpty()) {
            counter.set(0, counter.get(0) - 1);
            if (q.getFirst() == e) {
                count++;
                break;
            }
            counter.add(0);
            for (int i : p) {
                if (!vis[p.indexOf(i)] && is2((q.getFirst() - i) < 0 ? (i - q.getFirst()) : (q.getFirst() - i))) {
                    q.add(i);
                    vis[p.indexOf(i)] = true;
                    counter.set(counter.size() - 1, counter.get(counter.size() - 1) + 1);
                }
            }
            if (counter.get(0) == 0) {
                count++;
                counter.remove(0);
            }
            q.removeFirst();
        }
        System.out.println(count);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < Math.sqrt(n); i++) if (n % i == 0) return false;
        return true;
    }

    private static boolean is2(int n) {
        if (n == 1 || n == 2) return true;
        if (n == 0 || n % 2 != 0) return false;
        while (n != 1) {
            if (n % 2 != 0) return false;
            n /= 2;
        }
        return true;
    }
}
