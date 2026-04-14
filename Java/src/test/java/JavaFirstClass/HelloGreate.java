package JavaFirstClass;

import java.util.Scanner;

//Take name as input and print a greeting message for that particular name.

public class HelloGreate {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name : ");
	
		String name = sc.next();
		
		System.out.println("Hello "+name);
		
	}

}
