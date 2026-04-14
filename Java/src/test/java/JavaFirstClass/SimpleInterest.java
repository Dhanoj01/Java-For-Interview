package JavaFirstClass;

import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class SimpleInterest {
	
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Pricipal : ");
		double P = sc.nextDouble();
		
		System.out.println("Enter the Rate fo Interest : ");
		double R = sc.nextDouble();
		
		System.out.println("Enter the Time(In Years) : ");
		double T = sc.nextDouble();
		
		double SI = (P * R * T) / 100;
		
		System.out.println("The Simple interest is : " + SI);
	}

}
