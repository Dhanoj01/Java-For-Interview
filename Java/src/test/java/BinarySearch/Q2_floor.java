package BinarySearch;

public class Q2_floor {
	
	public static void main(String args[])
	{
		int arr[] = {-1 , 0 , 1 ,4, 6 ,7 ,9};
		
		int target = 5;
		
		int ans = floor(arr , target);
		
		System.out.println("index : "+ ans);
	}
	
	
	public static int floor(int arr[] , int target)
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
		
		return e;
		
		
	}

}



//The ceiling of a target value x in an array is the largest element 
//in that array that is less than or equal to x