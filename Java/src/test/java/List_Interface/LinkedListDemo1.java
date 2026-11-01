package List_Interface;

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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
