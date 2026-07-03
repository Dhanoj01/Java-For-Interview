package Sorting;

public class CyclicSort {
	
	public static void main(String args[])
	{
		int arr[] = {3,2,1,4,5};
		
		sort(arr);
		
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
	}
	
	public static void sort(int arr[])
	{
		int i=0;
		
		while(i<arr.length)
		{
			int correct = arr[i]-1;
			
			if(i != correct)
			{
				int temp = arr[i];
				arr[i] = arr[correct];
				arr[correct] = temp;
			}
			
			else
			{
				break;
			}
		}
	}

}


//if array given from 1 to N