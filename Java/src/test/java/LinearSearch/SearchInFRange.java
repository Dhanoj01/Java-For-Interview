package LinearSearch;

public class SearchInFRange {
	
	
	public static void main(String args[])
	{
		
		int nums[] = {3,45,67,32,678,1};
		
		int target= 67;
		
		System.out.println(search(nums , 2 ,4, target));
	
	}
	
	
	public static boolean search(int nums[] , int start ,int end , int target)
	{
		
		if(nums.length == 0)
		{
			return false;
		}
		
		while(start <= end)
		{
			if(nums[start] == target)
			{
				return true;
			}
			
			start++;
			
		}
		
		return false;
		
	}

}
