package JavaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//non terminal methods - filter , map , flatmap , distinct , limit
//terminal methods - count , max, min , reduced , toArray , forEach , collect

public class Demo1 {

	public static void main(String args[])
	{
		
		//distinct()
		
		List<String> vehiclesList = Arrays.asList("bus","trains","cycle","bus","car","car");
		List<String> distinctVehicles = vehiclesList.stream().distinct().collect(Collectors.toList());
		//System.out.println(distinctVehicles);
		vehiclesList.stream().distinct().forEach(value->System.out.println(value));
		
		
		//count()
		long count = vehiclesList.stream().distinct().count();
	    System.out.println(count);
	    
	    
	    //limit()
	    List<String> limitedVehiclesList = vehiclesList.stream().limit(3).collect(Collectors.toList()); 
	    System.out.println(limitedVehiclesList);
	}
}