package List_Interface;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {
	
	public static void main(String args[])
	{
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("A");
		al.add("E");
		al.add("F");
		al.add("B");
		al.add("C");
		al.add("D");
		
		System.out.println(al);
		
		
		//use of addAll() 
		
		ArrayList al_dup = new ArrayList();
		al_dup.addAll(al);
		System.out.println(al_dup);
		
		
		//use of removeAll()
		al_dup.removeAll(al);
		
		
		//sorting
		Collections.sort(al);
		System.out.println("Sorting : " + al);
		
		//sort in reverse order
		Collections.sort(al , Collections.reverseOrder());
		System.out.println("reverse order Sorting : " + al);
		
		
		//reverse
		Collections.reverse(al);
		System.out.println("Normal reverse : "+al);
		
		//shuffle()
		Collections.shuffle(al);
		System.out.println("After Shuffling : "+al);
		
	}

}
