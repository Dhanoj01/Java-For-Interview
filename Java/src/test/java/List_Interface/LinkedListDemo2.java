package List_Interface;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String args[])
	{
		
		LinkedList l = new LinkedList();
		
		l.add("X");
		l.add("R");
		l.add("T");
		l.add("Y");
		l.add("U");
		l.add("Q");
		l.add("P");
		
		LinkedList new_l = new LinkedList();
		
		
		//Add all
		new_l.addAll(l);
		System.out.println(new_l);
		
		
		//remove all
		new_l.removeAll(l);       //[]
		
		
		//sort() Collections.sort(collection)
		
		System.out.println("Before sorting: "+l);
		Collections.sort(l);
		System.out.println("After sorting: "+l);
		
		//reverse order
		Collections.sort(l , Collections.reverseOrder());
        System.out.println("Reverse order : "+ l);
        
        //shuffling 
        Collections.shuffle(l);
		System.out.println("After shuffling : "+l);

		
		
	}
}
