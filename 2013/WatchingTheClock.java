import java.util.Scanner;

public class WatchingTheClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int day = 24*60;
        int at = (a + 60) % day;
        int bt = (b + 60) % day;
        while (bt != at) {
            at = (at + a + 60) % day;
            bt = (bt + b + 60) % day;
        }
        int hrs = Math.floorDiv(at, 60);
        System.out.println((hrs < 10 ? "0" + hrs + "" : hrs + "") + ":" + ((at % 60 < 10) ? "0" + at%60 + "" : at%60 + ""));
    }
}
