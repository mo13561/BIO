import java.util.ArrayList;
import java.util.Scanner;

public class DecoderRing {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String all = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        ArrayList<Character> coded = new ArrayList<>();
        ArrayList<Character> alpha = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            alpha.add(all.charAt(i));
        }
        int n = sc.nextInt();
        String s = sc.nextLine().trim();
        int temp = 0;
        int index = 0;
        while (!alpha.isEmpty()) {
                if (temp == n - 1) {
                    coded.add(alpha.get(index));
                    alpha.remove(index);
                    temp = 0;
                } else {
                    index++;
                    temp++;
                }
            while (index >= alpha.size() && alpha.size() != 0) {
                index -= alpha.size();
            }
        }
        for (int i = 0; i < 6; i++) {
            System.out.print(coded.get(i));
        }
        System.out.println();
        for (int i = 0; i < s.length(); i++) {
            int val = (int) s.charAt(i) - 65 + i;
            while (val >= coded.size()) {
                val -= coded.size();
            }
            System.out.print(coded.get(val));
        }

    }
}
