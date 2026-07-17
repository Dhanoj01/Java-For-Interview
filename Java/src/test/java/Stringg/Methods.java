package Stringg;

import java.util.Arrays;

public class Methods {

	
	public static void main(String args[])
	{
		
		String name = "Dhanoj hello wowrld";
		
		System.out.println(Arrays.toString(name.toCharArray()));
		System.out.println(name.toLowerCase());
		System.out.println(name);
		System.out.println(name.indexOf('h'));
		System.out.println("     dhanoj   ".strip());
		System.out.println(Arrays.toString(name.split(" ")));
	}
}
