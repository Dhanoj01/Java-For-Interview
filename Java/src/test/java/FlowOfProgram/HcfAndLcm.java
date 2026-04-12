package FlowOfProgram;

import java.util.Scanner;

public class HcfAndLcm {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		// Store original values
		int a = x;
		int b = y;
		
		// Euclidean Algorithm for HCF
		while(y != 0)
		{
			int temp = y;
			y = x % y;
			x = temp;
		}
		
		int HCF = x;
		
		// Correct LCM
		int LCM = (a * b) / HCF;
		
		System.out.println("HCF is : " + HCF);
		System.out.println("LCM is : " + LCM);
		
		sc.close();
	}
}