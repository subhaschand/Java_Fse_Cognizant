package week1.FinancialForecasting;


import java.util.Scanner;

public class Main {

    // Optimized recursive power function
    public static double power(double base, int exp) {

        if (exp == 0)
            return 1;

        double half = power(base, exp / 2);

        if (exp % 2 == 0)
            return half * half;
        else
            return base * half * half;
    }

    public static double forecast(double amount, double rate, int years) {
        return amount * power(1 + rate / 100, years);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Initial Amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter Annual Growth Rate (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter Number of Years: ");
        int years = sc.nextInt();

        double futureValue = forecast(amount, rate, years);

        System.out.printf("\nFuture Value after %d years = %.2f\n", years, futureValue);

        sc.close();
    }
}