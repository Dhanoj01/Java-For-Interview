package SwitchCase;

import java.util.Scanner;

public class NestedSwitchCase {

	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);
		
		int  empID = sc.nextInt();
		String department = sc.next();

		switch (empID)
		{

		case 1:
			System.out.println("Dhanoj");
			break;

		case 2:
			System.out.println("Kunal");
			break;

		case 3:
			System.out.println("Employee number 3");

			switch(department)
			{
			case "IT":
				System.out.println("IT Department");
				break;


			case "Management":
				System.out.println("Management Department");
				break;

			default:
				System.out.println("No department entered");
			}

	   break;
	   
	   default:
		   System.out.println("incorrect EmpID");

		}

	}
}
