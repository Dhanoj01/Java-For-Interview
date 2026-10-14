package JavaStreams;

import java.util.Arrays;
import java.util.List;

public class Demo4 {

	public static void main(String args[])
	{
		
		List<String> stringList = Arrays.asList("A","B","C","1","2","3");
  
		
		//toArray()
		Object arr[] = stringList.stream().toArray();
		System.out.println(arr.length);
		
		for(Object obj : arr)
		{
			System.out.print(obj);
		}
	}
}
