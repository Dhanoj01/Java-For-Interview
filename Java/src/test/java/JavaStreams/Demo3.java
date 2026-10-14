package JavaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo3 {

	public static void main(String args[])
	{
		List<String> stringList = Arrays.asList("A","B","C","1","2","3");
		
		
		//reduced() - combine all the individual elements of a stream into a single summary value.
		Optional<String>reduced =stringList.stream().reduce((value,combinedValue)->{
			
			                     return combinedValue+value;
		                          });
		
		System.out.println(reduced.get());
	}
}
