import java.util.HashSet; //fails test 19 due to time exceeded and 20 due to halting on subtasks 2 and 4
import java.util.Scanner;

public class Crossing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine(); String a = sc.nextLine(); String b = sc.nextLine(); String c = sc.nextLine(); int q = sc.nextInt(); sc.nextLine();
        char[] t = sc.nextLine().trim().toCharArray();
        int[][] cases = new int[q][2];
        char[] change = new char[q];
        for (int i = 0; i < q; ++i) {
            cases[i][0] = sc.nextInt() - 1;
            cases[i][1] = sc.nextInt() - 1;
            change[i] = sc.next().charAt(0);
        }
        int inf = (int) Math.pow(10,9);HashSet<String> set = new HashSet<>();
        String[][][] dp = new String[18][18][18];
        dp[1][0][0] = a;
        dp[0][1][0] = b;
        dp[0][0][1] = c;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (i == 0 && j ==0 && k == 0) continue;
                    dp[i + 1][j][k] = cross(dp[i][j][k], a);
                    dp[i][j + 1][k] = cross(dp[i][j][k], b);
                    dp[i][j][k + 1] = cross(dp[i][j][k], c);
                }
            }
        }
        for (String[][] i : dp) {
            for (String j[] : i) {
                for (String k : j) {
                    if (k != null) set.add(k);
                }
            }
        }
        dp = new String[18][18][18];
        dp[1][0][0] = a;
        dp[0][1][0] = b;
        dp[0][0][1] = c;
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                for (int i = 0; i < 3; i++) {
                    if (i == 0 && j ==0 && k == 0) continue;
                    dp[i + 1][j][k] = cross(dp[i][j][k], a);
                    dp[i][j + 1][k] = cross(dp[i][j][k], b);
                    dp[i][j][k + 1] = cross(dp[i][j][k], c);
                }
            }
        }
        for (String[][] i : dp) {
            for (String j[] : i) {
                for (String k : j) {
                    if (k != null) set.add(k);
                }
            }
        }
        dp = new String[18][18][18];
        dp[1][0][0] = a;
        dp[0][1][0] = b;
        dp[0][0][1] = c;
        for (int k = 0; k < 3; k++) {
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 3; i++) {
                    if (i == 0 && j ==0 && k == 0) continue;
                    dp[i + 1][j][k] = cross(dp[i][j][k], a);
                    dp[i][j + 1][k] = cross(dp[i][j][k], b);
                    dp[i][j][k + 1] = cross(dp[i][j][k], c);
                }
            }
        }
        for (String[][] i : dp) {
            for (String j[] : i) {
                for (String k : j) {
                    if (k != null) set.add(k);
                }
            }
        }
        if (set.contains(String.valueOf(t))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        for (int i = 0; i < cases.length; i++) {

            for (int j = cases[i][0]; j <= cases[i][1]; ++j) {
                t[j] = change[i];
            }
            if (set.contains(String.valueOf(t))) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    public static String cross(String one, String two) {
        String s = "";
        char[] x = {'J', 'O', 'I'};
        for (int i = 0; i < one.length(); i++) {
            if (one.charAt(i) != two.charAt(i)) {
                for (char j : x) {
                    if (j != one.charAt(i) && j != two.charAt(i)) {
                        s+= j;
                    }
                }
            } else {
                s += one.charAt(i);
            }
        }
        return s;
    }
}
