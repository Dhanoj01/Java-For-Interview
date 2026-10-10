package JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map2 {
	
	public static void main(String args[])
	{	
	   List<String> vehicles = Arrays.asList("bus","car","bicycle","flight");
		
		List<Integer> vehiclesListLength = new ArrayList<Integer>();
		 
		
		//by normal method
//		for(String name : vehicles)
//		{
//			int len = name.length();
//			vehiclesListLength.add(len);
//		}
//		System.out.println(vehiclesListLength);
//		
		
		//By java Stream
		
		vehiclesListLength=	vehicles.stream().map(name->name.length()).collect(Collectors.toList());
		
		System.out.println(vehiclesListLength);
		
		
		//Dont store simply print
		vehicles.stream().map(name->name.length()).forEach(System.out::println);
		
	}

}
