package Array_ArrayList;

public class Q2MaxElement {

	
	public static void main(String args[])
	{
		int[] arr = {10,60,40,50,30};
	
		int ans = findMax(arr , 0 , 4);
		
		System.out.println("Max number in Array : " + ans);
		
	}
	
	public static int findMax(int arr[] , int S_index , int E_index)
	{
		int max=0;
		
		for(int i=S_index ; i<= E_index ; i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
			
			else
			{
				continue;
			}
		}
		
		return  max;
	}
}
