import javafx.util.Pair;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Scanner;

public class Q12020 {
    public static void main(String[] args) {
        int I = 1; int V = 5; int X = 10; int L = 50; int C = 100; int D = 500; int M = 1000;
        Scanner sc = new Scanner(System.in);
        String[] in = sc.nextLine().split(" ");
        String s = in[0];
        int n = Integer.parseInt(in[1]);
        for (int j = 0; j < n; j++) {
            ArrayList<Pair<Integer, Character>> r = runLength(String.valueOf(s));
            s = "";
            for (Pair i : r) {
                s += toRoman((int) i.getKey()) + i.getValue();
            }
        }
        int icount = 0; int vcount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                icount++;
            } else if (s.charAt(i) == 'V') {
                vcount++;
            }
        }
        System.out.println(icount + " " + vcount);
    }

    private static String toRoman(int n) {
        if (n == 0) return "";
        Pair<String, Integer> soFar = getNum(n);
        return soFar.getKey() + toRoman(n - soFar.getValue());
    }

    private static Pair<String, Integer> getNum(int n) {
        Object[][] l = {{"I", 1},{"IV", 4},{"V", 5},{"IX", 9},{"X", 10},{"XL", 40},{"L", 50},{"XC", 90},{"C", 100},{"CD", 400},{"D", 500},{"CM", 900},{"M", 1000}};
        int high = l.length - 1; int low = 0; int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ((int)l[mid][1] > n) {
                high = mid - 1;
            } else if ((int)l[mid][1] <= n) {
                ans = mid;
                low = mid + 1;
            }
        }
        return new Pair(l[ans][0], l[ans][1]);
    }

    private static ArrayList<Pair<Integer, Character>> runLength(@NotNull String s) {
        ArrayList<Pair<Integer, Character>> rle = new ArrayList<>();
        if (s.length() == 1) {
            rle.add(new Pair<>(1, s.charAt(0)));
            return rle;
        }
        char current = s.charAt(0);
        int i = 1; int count = 1;
        while (i < s.length()) {
            if (s.charAt(i) != current && i == s.length() - 1) {
                rle.add(new Pair<>(count, s.charAt(i-1)));
                rle.add(new Pair<>(1, s.charAt(i)));
            } else if (s.charAt(i) == current && i == s.length() - 1) {
                rle.add(new Pair<>(count + 1, s.charAt(i-1)));
            } else if (s.charAt(i) == current) {
                count++;
            } else {
                rle.add(new Pair<>(count, s.charAt(i-1)));
                count = 1;
                current = s.charAt(i);
            }
            i++;
        }
        return rle;
    }
}
