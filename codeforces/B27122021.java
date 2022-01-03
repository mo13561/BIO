import java.util.*;

public class B27122021 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < t; i++) {
            solve();
        }
    }

    private static void solve() {
        int n = sc.nextInt(); sc.nextLine();
        int[] songs = new int[n];
        int[] ratings = new int[n];
        for (int i = 0; i < n; i++) {
            int place = sc.nextInt();
            songs[i] = place;
            ratings[place - 1] = i;
        }
        sc.nextLine();
        String s = sc.nextLine();
        int index1 = 1;
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                flag = false; index1++;
            }
        }
        if (flag) {
            for (int i : songs) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        int[] all = new int[n];
        int index2 = 1;
        for (int i = 0; i < n; i++) {
            if (s.charAt(ratings[i]) == '1') {
                all[ratings[i]] = index1; index1++;
            } else {
                all[ratings[i]] = index2; index2++;
            }
        }
        for (int i : all) {
            System.out.print(i  + " ");
        }
        System.out.println();
    }
}
