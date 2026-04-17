package JavaFirstClass;

import java.util.Scanner;

public class LargestNumber {

	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num1 : ");
		int a = sc.nextInt();
		
		System.out.println("Enter the num2 : ");
		int b = sc.nextInt();
		
		if(a > b)
		{
			System.out.println("num1 " + a + " is greater");
		}
		else
		{
			System.out.println("num2 " + b + " is greater");
		}
	}
}
