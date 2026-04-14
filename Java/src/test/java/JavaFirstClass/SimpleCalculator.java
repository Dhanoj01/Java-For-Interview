package JavaFirstClass;

import java.util.Scanner;


//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)


public class SimpleCalculator {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the num1 : ");
		int a = sc.nextInt();

		System.out.println("Enter the num2 : ");
		int b = sc.nextInt();

		System.out.println("Enter the Operator(+ , - , * , /) : ");
		char op = sc.next().charAt(0);

		if(op == '+')
		{
			System.out.println("sum : " + (a+b));
		}

		else if(op== '-')
		{
			System.out.println("subtract : " + (a-b));
		}

		else if(op=='*')
		{
			System.out.println("mul : " + (a*b));
		}

		else if(op== '/'){
			if(b!=0)
			{
				System.out.println("devide : " + a/b);
			}
			else
			{
				System.out.println("Divide not possible ");
			}
		}

		else
		{
			System.out.println("Enter the Valid Operator... ");
		}
	}
}
