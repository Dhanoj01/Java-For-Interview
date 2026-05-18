package LinearSearch;

import java.util.Arrays;

public class SearchInString {
	
	public static void main(String args[]) {
		
		String name = "Kunal";
		char target = 'u';
		
		//System.out.println(search(name , target));
		System.out.println(Arrays.toString(name.toCharArray()));
		
	}
	
	//1. 
	public static boolean search(String name , char target)
	{
		
		if(name.length()==0)
		{
			return false;
		}
		
		for(int i=0 ; i<name.length() ; i++)
		{
			if(target == name.charAt(i))
			{
				return true;
			}
		}
		
		return false;
	}
	
	
	
	//2. 
	static boolean search2(String str , char target)
	{
		if(str.length() == 0)
		{
			return false;
		}
		
		for( char ch : str.toCharArray())
		{
			if(ch==target)
			{
				return true;
			}
		}
		
		return false;
	}

}
