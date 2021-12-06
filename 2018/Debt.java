import java.util.Scanner;

public class Debt {
    public static double compute(double interest, double repay) {
        double amount = 10000;
        double cost = 0;
        interest /= 100;
        repay /= 100;
        while (amount > 0) {
            amount += Math.ceil(amount*interest);
            double topay = Math.ceil(amount*repay);
            if (amount < 5000) {
                cost += amount;
                amount = 0;
            } else if (topay > 5000) {
                cost += topay;
                amount -= topay;
            } else {
                cost += 5000;
                amount -= 5000;
            }
        }
        return cost/100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double interest = sc.nextDouble();
        double re = sc.nextDouble();
        System.out.println(compute(interest, re));
    }
}
