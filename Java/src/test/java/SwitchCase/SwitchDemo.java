package SwitchCase;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		String fruits  = sc.next();
		
		
		
		switch(fruits)
		{
			case "Mango":
				System.out.println("Kings of fruits");
				break;
				
			case "Apple":
				System.out.println("red sweet fruit");
				break;
				
			case "Grapes":
				System.out.println("samll tasty fruit");
				break;
				
			case "Orange":
				System.out.println("Round and orange fruit");
				break;
		
			default :
			    System.out.println("Invalid fruit");
				
		}
		
		
		//Enhanced switch  <java 14 onwards>      
	    /*	
		switch(fruits)
		{
			case "Mango" -> System.out.println("Kings of fruits");
			case "Apple" -> System.out.println("red sweet fruit");
			case "Grapes"->System.out.println("samll tasty fruit");			
			case "Orange"->System.out.println("Round and orange fruit");
			default->System.out.println("Invalid fruit");	
		}
		*/
		
		/*	
		switch(day)
		{
			case "1" -> System.out.println("Monday");
			case "2" -> System.out.println("Tuesday");
			case "3"->System.out.println("Wednesday");			
			case "4"->System.out.println("Thursday");
			case "5"->System.out.println("Friday");
			case "6"->System.out.println("Saturday");
			case "7"->System.out.println("Sunday");

			default->System.out.println("Invalid Day");	
		}
		*/
	}
}
