package BinarySearch;

public class OrderAgnosticBS {
	
    public static void main(String args[])
    {
    	// Array is given dont know whether it is sorted in ASC or DES Order.
    	
	//	int arr[] = {-1 , 0 , 1 ,4, 6 ,7 ,9};
		
		int arr[] = {89 , 77 , 45 , 34 , 22 , 11 , 9};
		int target = 9;
		int ans = orderAgnosticBS(arr , target);
		
		System.out.println("ans : " + ans);

    }
    
    public static int orderAgnosticBS(int arr[] , int target)
    {
    	
    	//to check order
    	boolean Asc = false;
    	int s = 0;
    	int e = arr.length -1;
    	
    	if(arr[s] < arr[e])
    	{
    		Asc = true;
    	}
    	
    	
    	while(s <= e )
		{
			
			int mid = s + (e-s)/2;
			
			if(arr[mid]==target)
			{
				return mid;
			}
			
			else if(Asc)
			{

				 if (target > arr[mid])
				{
					s = mid + 1;
				}
				
				else
				{
					e = mid - 1;
				}
			}
			
			else
			{

				 if (target < arr[mid])
				{
					s = mid + 1;
				}
				
				else
				{
					e = mid - 1;
				}
			}
			
		}
    	
    	return -1;
    }

}
