package LinearSearch;

public class Main {

	
	public static void main(String args[])
	{
		
		int[] nums = {23,45,1,2,8,19,-3,16,-11,28};
		int target= 19;
		
		 boolean ans = linearSearch(nums , target);
		 System.out.println(ans);
		 
		
	}
	
	//1. Boolean true/false
	static boolean linearSearch(int nums[] , int target)
	{
		
		if(nums.length == 0 )
		{
			return false;
		}
		
		for(int element : nums)
		{
			if(element == target)
			{
				return true;
			}
		}
		
		return false;
	}
	
	//2. return target index
	static int linearSearch2(int nums[] , int target)
	{
		
		if(nums.length == 0)
		{
			return -1;
		}
		
		for(int i=0 ; i<nums.length ; i++)
		{
			if(nums[i]==target)
			{
				return i;
			}
		}
		
		return -1;
	}
	
	//3. search the target and return the element 
	static int linearSearch3(int nums[] , int target)
	{
		if(nums.length==0)
		{
			return -1;
		}
		
	for(int element : nums)
	{
		if(element == target)
		{
			return element;
		}
	}
	
	return Integer.MAX_VALUE;    //array contains the negative element also
	}
	
}
