package BinarySearch;

public class Q1_Ceiling {
	
	public static void main(String args[])
	{
		int arr[] = {-1 , 0 , 1 ,4, 6 ,7 ,9};
		
		int target = 5;
		
		int ans = ceiling(arr , target);
		
		System.out.println("index : "+ ans);
	}
	
	
	public static int ceiling(int arr[] , int target)
	{
		int n = arr.length -1 ;
		
		if( arr[n] < target)
		{
			return -1;
		}
	 
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
		
		return s;
		
		
	}

}



//The ceiling of a target value x in an array is the smallest element 
//in that array that is greater than or equal to x