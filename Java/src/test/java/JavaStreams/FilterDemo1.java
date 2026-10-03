package JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {
	

	
	public static void main(String args[])
	{
		
		List<String> name = Arrays.asList("Dhanoj","manish","Karan","Mandar vijay");
		
		List<String> ans = new ArrayList<String>();
		
		ans = name.stream().filter(s->s.length()>7 && s.length() < 15).collect(Collectors.toList());
		
		System.out.println(ans);
	}

}
