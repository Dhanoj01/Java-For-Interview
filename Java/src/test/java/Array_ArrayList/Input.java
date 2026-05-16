package Array_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Input {

	
	public static void main(String args[])
	{
		int[] arr = new int[5];
		
		arr[0] = 1 ;
		arr[1] = 90 ;
		arr[2] = 56 ;
		arr[3] = 43 ;
		arr[4] = 3;
		
		System.out.println(arr[3]);     //43
		
		//input using for loops
		Scanner sc = new Scanner(System.in);
		for(int i=0 ; i< arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		//printing array
		for(int i=0 ; i< arr.length ; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		//print By advanced loop
		for(int num : arr)
		{
			System.out.print(num+" ");
		}
		
		//print by converting array to string
		System.out.println(Arrays.toString(arr));
	}
}
