package Stringg;

import java.util.HashMap;
import java.util.Map;

public class CountCharacter {
	
	public static void main(String args[])
	{
		
		//count the char in string 
		
		String name = "dhanojd";
		
		Map<Character , Integer> map = new HashMap<Character,Integer>();
		
		for(int i=0; i<name.length() ; i++)
		{
			char c = name.charAt(i);
			
			map.put(c, map.getOrDefault(c,0)+1);

		}

		
       System.out.println(map);
		
		
		
		
		// duplicates char in string 
		
		String str = "oracleioea";
		
		for(int i=0 ; i<str.length() ; i++)
		{
			for(int j=i+1 ; j< str.length() ; j++)
			{
				if(str.charAt(i) == str.charAt(j))
				{
					System.out.println(str.charAt(i));
				}
			}
		}
	}

}
