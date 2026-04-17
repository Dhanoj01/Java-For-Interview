package JavaFirstClass;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number to get fibonacci series: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        while (a <= n) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }

        sc.close();
    }
}