package Array_ArrayList;

public class Q1swap {

	public static void main(String args[])
	{
		int[] arr = {1,2,3,4};
		
		System.out.println("Array before swap......");
		print(arr);
		
		swap(arr , 1 , 3);
		
		System.out.println("Array After swap......");
		print(arr);
	}
	
	public static void swap(int arr[] , int index1 , int index2)
	{
	   
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	public static void print(int arr[])
	{
		for(int a : arr)
		{
			System.out.print(a+" ");
		}
		System.out.println();

		
	}
}
