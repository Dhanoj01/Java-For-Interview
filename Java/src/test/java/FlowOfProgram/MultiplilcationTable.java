package FlowOfProgram;

import java.util.Scanner;

//Take a number as input and print the multiplication table for it.

public class MultiplilcationTable {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the input : ");
		int input = sc.nextInt();
		
		int count = 1;
		for(int i= 1 ; i<= 10 ; i++)
		{
		    int mul = input * count;
			System.out.println(input + " * " + count + " = " + mul);
			
			count++;
		}
	}
}
