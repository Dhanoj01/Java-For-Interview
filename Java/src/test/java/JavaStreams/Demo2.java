package JavaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo2 {

	public static void main(String args[])
	{

		List<Integer> numberList = Arrays.asList(2,3,5,6,7,0);


		//count()
		long Evencount=numberList.stream().filter(num->num%2==0).count();
		System.out.println(Evencount);

		//min()
		Optional<Integer>min = numberList.stream().min((val1,val2)->{
			return val1.compareTo(val2);
		});

		System.out.println(min.get());

		//max
		Optional<Integer> max= numberList.stream().max((val1,val2)->{
			return val1.compareTo(val2);
		});

		System.out.println(max.get());
		
	}

}
