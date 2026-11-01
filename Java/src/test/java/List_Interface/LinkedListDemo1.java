package List_Interface;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {
	
	public static void main(String args[])
	{
		
		//Declare Linked List
		
		LinkedList<String> ll = new LinkedList<>();
		
		LinkedList l = new LinkedList();
		
		//Add element into linked list
		l.add(0);
		l.add("dks");
		l.add(true);
		l.add(1.34);
		l.add(null);
		l.add('A');
		
		System.out.println(l);
		
		System.out.println(l.size());      //6
		
		
		//remove by index
		l.remove(3);    
		
		//Insert in the middle
		l.add(3, "game");
		
		System.out.println(l);
		
		//retriving value
		System.out.println(l.get(3));
		
		//change the value
		l.set(3, "chess");
		
		//contains()
		System.out.println(l.contains("java"));
		System.out.println(l.contains("chess"));
		
		//isEmpty
		System.out.println(l.isEmpty());
		
				
		//Reading element from LL using for loop
		for(int i=0 ; i<l.size() ; i++)
		{
			System.out.print(l.get(i) +" ");
		}
		
		//using for each loop
		for(Object e : l)
		{
			System.out.print(e + " ");
		}
		
		//iterator() method
		Iterator it = l.iterator();		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
	}

}
