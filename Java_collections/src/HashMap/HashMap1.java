//Java HashMap example to add() elements.Here, we see different ways to insert elements.
package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>list=new HashMap<Integer,String>();
		list.put(100,"Amit");  
		list.put(101,"Vijay");    
		list.put(102,"Rahul"); 
		System.out.println("After adding elements:");
		for(Entry<Integer, String> m:list.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
		
		list.putIfAbsent(103, "Gaurav");
		System.out.println("After invoking ifAbsent:");
		for(Entry<Integer, String> m:list.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
		
		HashMap<Integer,String>list2=new HashMap<Integer,String>();
		list2.put(104,"Ravi");
		list2.putAll(list);
		
		System.out.println("After invoking elements after using putAll()method:");
		for(Entry<Integer, String> m:list2.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
		
	}

}
