import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SuffixArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<String> suff = new ArrayList<>(); suff.add("");
        for (int i = 0; i < s.length(); i++) {
            suff.add(s.substring(i));
        }
        for (int i = 0; i < suff.size() - 1; i++) {
            bubble(suff);
        }
        System.out.print(s.length() + " ");
        for (int i = suff.size() - 1; i > 0; i--) {
            System.out.print((s.length() - suff.get(i).length()) + " ");
        }
    }

    private static void bubble(ArrayList<String> suff) {
        for (int i = 1; i < suff.size() - 1; i++) {
            int size = Math.min(suff.get(i).length(), suff.get(i+1).length());
            for (int j = 0; j < size; j++) {
                if (suff.get(i).charAt(j) > suff.get(i+1).charAt(j)) {
                    break;
                } else if (suff.get(i).charAt(j) < suff.get(i+1).charAt(j)){
                    Collections.swap(suff, i, i+1);
                    break;
                }
            }
        }
    }
}
