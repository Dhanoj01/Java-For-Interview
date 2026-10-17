package JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap1 {
	
	public static void main(String args[])
	{
		
		//map
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
		List<Integer> ans = list1.stream().map(num->num+10).collect(Collectors.toList());
		System.out.println(ans);
		
		
		//flatMap
		List<Integer> lst1 = Arrays.asList(1,2);
		List<Integer> lst2 = Arrays.asList(3,5);
		List<Integer> lst3 = Arrays.asList(6,7);
		
		List<List<Integer>> finalList = Arrays.asList(lst1,lst2,lst3);
		
		List<Integer> ansList = new ArrayList<Integer>();
		
		ansList = finalList.stream().flatMap(x->x.stream()).map(x->x+10).collect(Collectors.toList());
		
		System.out.println(ansList);
		
		
	}

}
