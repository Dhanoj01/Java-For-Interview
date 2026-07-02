package BinarySearch;

public class Q3_Smallestletter {

	public static void main(String args[])
	{
		char arr[] = {'c','f','j'};
		
		char target = 'd';
		
		char ans = nextGreatestLetter(arr , target);
		
		System.out.println(ans);
	}
	
	
	public static char nextGreatestLetter(char letter[] , int target)
	{
	 
		int s = 0;
		int e = letter.length - 1;
		
		while(s <= e )
		{
			
			int mid = s + (e-s)/2;
			
			if(target > letter[mid])
			{
				s = mid + 1;
			}
			
			else
			{
				e = mid - 1;
			}
		
		}
		
		return letter[ s % letter.length] ;      //s % N
		
		
	}
}


//smallest letter greater then target
//Input: letters = ["c","f","j"], target = "a"
//Output: "c"
//Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.