package JavaFirstClass;

import java.util.Scanner;

public class CheckCase {

	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the char :");

		char c = sc.next().charAt(0);
		
		if(c >= 'a' && c<= 'z')
		{
			System.out.println("Character is : "+ "Lower");
		}
		else
		{
			System.out.println("Character is : "+ "Upper");

		}
	}
}
