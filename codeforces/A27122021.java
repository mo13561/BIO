import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A27122021 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int[] l = new int[3];
            for (int j = 0; j < l.length; j++) l[j] = sc.nextInt();
            Arrays.sort(l);
            System.out.println(((l[0] + l[1] == l[2])||(((l[1] == l[0]) && l[2] % 2 == 0)||((l[1] == l[2]) && l[0] % 2 == 0)||((l[2] == l[0]) && l[1] % 2 == 0)))?"YES":"NO");
        }
    }
}