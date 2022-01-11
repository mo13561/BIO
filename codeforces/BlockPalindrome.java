import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;

public class BlockPalindrome {
    static ArrayList<String> all = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = 0;
        find(s, "" , 0);
        for (String i : all) {
            String rev = reverse(i);
            if (i.equals(rev)) {
                ans++;
            }
        }
        System.out.println(ans - 1);
    }

    private static String reverse(String i) {
        String rev = "";
        String temp = "";
        for (int j = 0; j < i.length(); j++) {
            if (i.charAt(j) == '|') {
                rev = temp + rev;
                temp = "";
            }
            temp += i.charAt(j);
        }
        return rev + "|";
    }

    private static void find(String s, String done, int l) {
        if (l == s.length()) {
            all.add(done + "|");
        }
        for (int i = l; i < s.length(); i++) {
            find(s, done + "|" + s.substring(l, i + 1), i + 1);
        }
    }
}