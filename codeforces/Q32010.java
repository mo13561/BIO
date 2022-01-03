import java.util.*;

public class Q32010 {
    public static class Jug {
        private int cap;
        private int val = 0;

        public Jug(int cap) {
            this.cap = cap;
        }

        public Jug(int cap, int val) {
            this.cap = cap;
            this.val = val;
        }

        public void add(int water) {
            if (water > this.cap) {
                this.val = this.cap;
            } else {
                this.val += water;
            }
        }

        public void empty() {
            this.val = 0;
        }
    }
    public static int solve (int j, int n, int[]c) {
        int moves = 1;
        int count = 0;
        ArrayList<Integer> counter = new ArrayList<>();
        counter.add(3);
        HashMap<Integer[], ArrayList<Jug>> map = new HashMap<>();
        ArrayList<Jug> jugs = new ArrayList<>();
        for (int i = 0; i < j; i++) jugs.add(new Jug(c[i]));
        map.put(new Integer[j],jugs);
        ArrayDeque<Integer[]> d = new ArrayDeque<>();
        d.add(new Integer[j]);
        while (!d.isEmpty()) {
            for (int i : d.getFirst()) {
                if (i == n) {
                    count++;
                    return count;
                }
            }
            for (int i = 0; i < j; i++) { // empty
                ArrayList<Jug> ves = new ArrayList<>();
                for (int k = 0; k < j; k++) {
                    if (k == i) {
                        ves.add(new Jug(c[k], 0));
                    } else {
//                        ves.add((new Jug(c[k], map.get((new Integer[j])))));
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt(); int n = sc.nextInt(); int[] c = new int[j];
        for (int i = 0; i < j; i++) c[i] = sc.nextInt();
        if (j == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(solve(j, n ,c));
    }
}
