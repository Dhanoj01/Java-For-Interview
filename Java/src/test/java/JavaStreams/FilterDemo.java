package JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
	
	public static void main(String[] args)
	{
		
//		ArrayList<Integer> numberList = new ArrayList<>();
//		
//		numberList.add(10);
//	    numberList.add(15);
		
		List<Integer> numberList = Arrays.asList(10,15,20,25,30);
		
		List<Integer> evenNumberList = new ArrayList<>();
		
		
		//without using streams
		for( int n : numberList)
		{
			if(n%2==0)
			{
		//		evenNumberList.add(n);
			}
		}
	    
		System.out.println(evenNumberList);
		
		
		//with Streams and store it other collection
		evenNumberList=numberList.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenNumberList);

		
		numberList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		                                   //.forEach(System.out::println);
	}

}
