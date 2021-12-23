import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); int k = sc.nextInt(); int x = sc.nextInt(); x--;
            sc.nextLine();
            String s = sc.nextLine();
            String r = "";
            ArrayList<Integer> weights = new ArrayList<>();
            ArrayList<Integer> cs = new ArrayList<>();
            weights.add(1);
            for (int j = s.length() - 1; j >= 0; j--) {
                r += s.charAt(j);
            }
            int count = 0;
            int left = 1;
            int q = k;
            for (int j = 0; j < r.length(); j++) {
                if (r.charAt(j) == 'a') {
                    continue;
                }
                count++;
                if (j == r.length() - 1) {
                    cs.add(count); continue;
                }
                if (r.charAt(j+1) == 'a') { //broken here
                    int h = count * q + left;
                    left += count * q;
                    weights.add(h);
                    cs.add(count);
                    count = 0;
                    q = h;
                }
            }
            int index = 0;
            int[] ans = new int[cs.size()];
            int p = cs.size() - 1;
            int j = cs.get(cs.size()-1);
            int cur = weights.get(cs.size()-1);
            while (true) {
                if (x - cur >= 0 && j != 0) {
                    x -= cur;
                    ans[index]++;
                    j--;
                } else if (j == 0) {
                    cur = weights.get(--p);
                    j = cs.get(p);
                    index++;
                }
                if (x == 0) break;
            }
            count = -1;
            String a = "";
            for (int l = 0; l < s.length(); l++) {
                if (s.charAt(l) == 'a') {
                    a += 'a';
                } else {
                    for (int c = l; c < s.length();c++) {
                        if (s.charAt(c) == '*') {
                            l++;
                        } else {
                            break;
                        }
                    }
                    count++;
                    for (int c = 0; c < ans[count]; c++) a += 'b';
                }
            }
            System.out.println(a);
        }
    }
}
