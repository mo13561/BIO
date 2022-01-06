import java.util.Scanner;

public class DigitWords {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int ans = solve();
        System.out.println(ans == -1 ? "NO" : ans);

    }

    public static int solve() {
        String[] all = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
        String s = sc.nextLine();
        for (int i = 0; i < 9; i++)  {
            int index = 0;
            for (int j = 0; j < s.length();  j++) {
                if (s.charAt(j) == all[i].charAt(index)) {
                    if (index == all[i].length() - 1) {
                        return i+1;
                    }
                    index++;
                }
            }
        }
        return -1;
    }
}
