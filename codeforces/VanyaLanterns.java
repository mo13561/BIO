import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class VanyaLanterns {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double n = sc.nextDouble(); double l = sc.nextDouble();
        ArrayList<Double> ls = new ArrayList<>();
        ArrayList<Double> diffs = new ArrayList<>();
        for (int i = 0; i < n; i++) ls.add(sc.nextDouble());
        ls.sort(Comparator.naturalOrder());
        if (!ls.contains(0.0)) diffs.add(ls.get(0));
        if (!ls.contains(l)) diffs.add(l - ls.get(ls.size() - 1));
        for (int i = 1; i < ls.size(); i++) diffs.add((ls.get(i) - ls.get(i - 1))/2.0);
        diffs.sort(Comparator.naturalOrder());
        System.out.println(diffs.get(diffs.size() - 1));
    }
}
