package List_Interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {
	
	public static void main(String args[])
	{
		//Declare ArrayList
		ArrayList al = new ArrayList();
		ArrayList<Integer> ar = new ArrayList<Integer>();
		List li = new ArrayList();
		
		
		//add new element to arrayList
		al.add(100);
		al.add("name");
		al.add('A');
		al.add(true);
		
		//print
		System.out.println(al);
		
		//size()
		System.out.println("size: " + al.size());
		
		//remove()
		al.remove(0);      //index
		al.remove("name"); //value
		
		
		
		//insert a new element
		al.add(1,"python");
		
		//retrieve element of specific index
		al.get(2);
		
		//change element or replace
		al.set(1, "C#");
		
		//searching   - true/false
		boolean flag = al.contains("C#");
		System.out.print(flag);
		
		
		//isEmpty
		al.isEmpty();	
		
		//1.) for loop
		
		System.out.println("Reading element using for loop");
		for(int i=0 ; i< al.size() ; i++)
		{
			System.out.println(al.get(i));
		}
		
		
		//2.) for each loop
		System.out.println("Reading element using for each loop");
		for(Object c : al)
		{
			System.out.print(c + " ");
		}
		
		//3.) iterator method
		System.out.println("-----------Reading by Iterator method-----------");
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
