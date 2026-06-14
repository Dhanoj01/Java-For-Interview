package Searching;

import java.util.Arrays;

public class BubbleSorting {
	
	public static void main(String args[])
	{
		
		int nums[] = {5,1,3,2,4};
		
		bubblesort(nums);
		
		System.out.println(Arrays.toString(nums));
	}
	
	public static void bubblesort(int[] nums)
	{
		
		for(int i=0 ; i<nums.length ; i++)
		{
			boolean swapped = false;
			for(int j=0 ; j<nums.length-i-1 ; j++)
			{
				if(nums[j] > nums[j+1])
				{
					int temp = nums[j+1];
					nums[j+1]=nums[j];
					nums[j]=temp;
					swapped = true;
				}
			}
			
			if(!swapped)
			{
				break;
			}
		}
	}

}
