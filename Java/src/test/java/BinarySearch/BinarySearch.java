package BinarySearch;

public class BinarySearch {

	public static void main(String args[])
	{
		int arr[] = {-1 , 0 , 1 ,4, 6 ,7 ,9};
		
		int target = 4;
		
		int ans = binarySearch(arr , target);
		
		System.out.println("index : "+ ans);
	}
	
	
	public static int binarySearch(int arr[] , int target)
	{
	 
		int s = 0;
		int e = arr.length - 1;
		
		while(s <= e )
		{
			
			int mid = s + (e-s)/2;
			
			if(target > arr[mid])
			{
				s = mid + 1;
			}
			
			else if(target < arr[mid])
			{
				e = mid - 1;
			}
			
			else
			{
				return mid;
			}
		}
		
		return -1;
		
		
	}
}
