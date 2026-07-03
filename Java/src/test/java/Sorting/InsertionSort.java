package Sorting;

import java.util.Arrays;

public class InsertionSort {

	
	public static void main(String args[])
	{
		int arr[] = {5,4,1,2,3};
		
		insertion(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	public static void insertion(int arr[])
	{
		
		for(int i=1 ; i<arr.length -1 ; i++)
		{
			for(int j=i ; j>0 ; j--)
			{
				if(arr[j] < arr[j-1])
				{
					int temp = arr[j];
				     arr[j] = arr[j-1];
				     arr[j-1] = temp;
				}
				
				else
				{
					break;
				}
			}
		}
	}
	
}
