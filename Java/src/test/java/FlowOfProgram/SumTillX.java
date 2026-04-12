package FlowOfProgram;

import java.util.Scanner;

//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

public class SumTillX {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	    int sum=0;
		
	    System.out.println("Enter the Values and To Stop X : ");
	    
	    while(sc.hasNextInt())
	    {
	    	int num = sc.nextInt();
	    	sum += num;
	    }
	   
	    System.out.println("Total sum Before X : "+ sum);
	}
}
