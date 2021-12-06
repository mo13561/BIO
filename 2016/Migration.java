import java.util.ArrayList;
import java.util.Scanner;

public class Migration {
    public static int[][] grid = new int[100][100];

    public static int[] getPosition(int p) {
        p--;
        return new int[]{Math.floorDiv(p, 5) + 50, (p%5) + 50};//y, x
    }

    public static void clear(int x, int y) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(x); list.add(y);
        while (!list.isEmpty()) {
            int i = list.get(0);
            int j = list.get(1);
            if (grid[i][j] >= 4) {
                grid[i][j] -= 4;
                for (int k = -1; k <= 1; k+= 2) {
                    grid[x + k][y]++;
                    list.add(x+k); list.add(y);
                }
                for (int k = -1; k <= 1; k+= 2) {
                    grid[x][y + k]++;
                    list.add(x); list.add(y+k);
                }
            }
            list.remove(0); list.remove(0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt(); int s = sc.nextInt(); int n = sc.nextInt(); int[] ss = new int[s];
        for(int i = 0; i < s; i++) {
            ss[i] = sc.nextInt();
        }
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (j >= 0) {
                p += ss[j];
                while (p > 25) {
                    p -= 25;
                }
            }
            int[] c = {getPosition(p)[0], getPosition(p)[1]};
            grid[c[0]][c[1]] += 1;
            clear(c[0], c[1]);
            j = ++j % ss.length;
        }
        for (int i = 50; i < 55; i++) {
            for (int k  = 50; k < 55; k++) {
                System.out.print(grid[i][k] + " ");
            }
            System.out.println();
        }
    }
}
