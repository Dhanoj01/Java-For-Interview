package JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {

	public static void main(String args[])
	{
		
		List<String> words = Arrays.asList("cup","forest",null,"tap",null);
		
		List<String> ans = new ArrayList<String>();
		
	//	ans = words.stream().filter(w->w != null).collect(Collectors.toList());
			
		//System.out.println(ans);
		
		words.stream().filter(w->w!=null).forEach(System.out::println);
		
		
	}
}
