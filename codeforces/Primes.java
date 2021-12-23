import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Primes {
    static ArrayList<Integer> primes = new ArrayList<>();
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int p, q, l;
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        p = sc.nextInt();
        q = sc.nextInt();
        primes.add(p);
        for (int i = 0; i <= l; i++) {
            if (isPrime(i) && !primes.contains(i)) {
                primes.add(i);
            }
        }
        System.out.println(solve(p, q, l));
    }

    private static int solve(int p, int q, int l) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap();
        for (int i = 0; i < primes.size(); i++) {
            ArrayList<Integer> adj = new ArrayList<>();
            for (int j = 0; j < primes.size(); j++) {
                int n = 0;
                while (Math.pow(2, n) <= l) {
                    if (Math.abs(primes.get(i) - primes.get(j)) == Math.pow(2, n)) {
                        adj.add(primes.get(j));
                    }
                    n++;
                }
            }
            map.put(primes.get(i), adj);
        }
        ArrayList<Integer> cSet = new ArrayList<>();
        cSet.add(p);
        ArrayList<Integer> cAdj = map.get(p);
        int number = 1;
        boolean flag = false;
        ArrayList<Integer> numbers;
        ArrayList<Integer> counter = new ArrayList<>();
        counter.add(1);
        while (!map.isEmpty()) {
            ArrayList<Integer> add = new ArrayList<>();
            for (int i : map.get(cSet.get(0))) {
                if (i == q) {
                    number++;
//                    System.out.println(i);
                    map.clear();
                    flag = true;
                    break;
                }
                if (i != p) add.add(i);
            }
            if (flag) continue;
            cSet.remove(0);
            for (int k : add) {
                cSet.add(k);
            }
            counter.add(add.size());
            add.clear();
            counter.set(0, counter.get(0) - 1);
            if (counter.get(0) == 0) {
                number++;
                counter.remove(0);
            }
        }
        return number;
    }
}
