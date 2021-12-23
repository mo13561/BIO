import java.util.Scanner;

public class B20122021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            double n = sc.nextDouble() + 0.5;//add 0.5 to account for when n is a sq or cube. by adding 0.5 we will always 'find' the sq or cube that IS n as we are searching slightly above.
            long sq = (long)Math.pow(n, 1.0/2);
//            while (sq*sq  <= n || sq*sq > n) {
//                if ((sq+1)*(sq+1) <= n) {
//                    sq++;
//                } else if ((sq-1)*(sq-1) > n) {
//                    sq--;
//                } else {
//                    break;
//                }
//            } //this is the same as the other whiles just a bit long.
            while (sq*sq > n) sq--;
            long cr = (long)Math.pow(n, 1.0/3);
//            while (cr*cr*cr < n) cr++;
//            while (cr*cr*cr > n) cr--;
            long ar = (long)Math.pow(n, 1.0/6);
//            while (ar*ar*ar*ar*ar*ar < n) ar++;
//            while (ar*ar*ar*ar*ar*ar > n) ar--;
            System.out.println(cr + sq - ar);
        }
    }
}
