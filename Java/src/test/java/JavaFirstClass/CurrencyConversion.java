package JavaFirstClass;

import java.util.Scanner;

// Input currency in rupees and output in USD

public class CurrencyConversion {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount in Rupees: ");
        double rupee = sc.nextDouble();

        double exchangeRate = 92.80; // approx current rate (update when needed)

        double usd = rupee / exchangeRate;

        System.out.println("Amount in USD: " + usd);

        sc.close();
    }
}