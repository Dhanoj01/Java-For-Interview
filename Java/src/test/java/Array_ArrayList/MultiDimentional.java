package Array_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentional {

	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		
		//input
		for(int row = 0 ; row< 3 ; row++)
		{
			for(int col=0 ; col<3 ; col++)
			{
				arr[row][col] = sc.nextInt();
			}
		}
		
//		for(int row = 0 ; row< arr.length ; row++)
//		{
//			for(int col=0 ; col< arr[row].length ; col++)
//			{
//				arr[row][col] = sc.nextInt();
//			}
//		}
		
		
		int[][] nums = {
				{1,2,3},
				{4,5},
				{5,6,7}
		};
		
		
		//Printing the 2D array
		for(int row = 0 ; row< 3 ; row++)
		{
			for(int col=0 ; col<3 ; col++)
			{
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
		
		//print method 2
		for(int row = 0 ; row< 3 ; row++)
		{
		     System.out.println(Arrays.toString(arr[row]));
		}
		
		//print method 3
		for(int[] a : arr)
		{
			System.out.println(Arrays.toString(a));
		}
	}
}
