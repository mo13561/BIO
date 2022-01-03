import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class BlockChain {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int l = sc.nextInt(); String c = sc.nextLine().trim(); char[] s = new char[l];
        for (int i = 0; i < c.length(); i++) s[i] = c.charAt(i);
        ArrayList<Character> pre = new ArrayList<>();
        for (int i = 0; i < c.length(); i++) pre.add(c.charAt(i));
        ArrayList<Character> need = new ArrayList<>();
        for (int i = 65; i < l + 65; i++) {
            if (!pre.contains((char)i)) {
                need.add((char)i);
            }
        }
        ArrayList<char[]> all = new ArrayList<>();
        for (int i = 0; i < need.size(); i++) {
            char[] temp = new char[l];
            int count = 0;
            for (int j = 0; j < c.length(); j++) {
                temp[j] = s[j];
                count = j + 1;
            }
            for (int j = 0; j < need.size(); j++) {
                if (need.get(i) != need.get(j)) {
                    temp[count] = need.get(j);
                    temp[++count] = need.get(i); count++;
                }
            }
            all.add(temp);
        }
        System.out.println("z");
    }
}
