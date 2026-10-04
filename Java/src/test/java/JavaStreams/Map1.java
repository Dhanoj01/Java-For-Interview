package JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map1 {

	public static void main(String args[])
	{
		
		List<String> vehicles = Arrays.asList("bus","car","bicycle","flight");
		
		List<String> vehiclesListUpperCase = new ArrayList<String>();
		
//      normal for loop
		
//		for(String name : vehicles)
//		{
//			vehiclesListUpperCase.add(name.toUpperCase());
//		
//		}
		
		
		
		
		
		//by stream -> map
		
		vehiclesListUpperCase=vehicles.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		System.out.println(vehiclesListUpperCase);
	}
}
