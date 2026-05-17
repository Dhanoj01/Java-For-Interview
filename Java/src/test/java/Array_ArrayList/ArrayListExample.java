package Array_ArrayList;

import java.util.ArrayList;

public class ArrayListExample {

	
	public static void main(String args[])
	{
		ArrayList<Integer> list = new ArrayList<>(10);
		         //wrapper class                  //intial size
		
		list.add(10);
		list.add(20);
		list.add(30);  //we can add it by for loop
		list.add(40);
		list.add(50);
		
		
		System.out.println(list.contains(60));
		list.set(0, 99);
		list.remove(1);
		
		System.out.println(list.get(2));
		System.out.println(list);
		
		//internally size is fixed in arrayList , it will create a new list 
		//and double the size
		
		
	} 
}
