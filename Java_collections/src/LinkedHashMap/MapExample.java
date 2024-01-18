package LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	LinkedHashMap<Integer,String>list=new LinkedHashMap<Integer,String>();
	list.put(100,"Amit");  
	list.put(101,"Vijay");  
	list.put(102,"Rahul");  
	
	for(Entry<Integer, String> m:list.entrySet())
		System.out.println(m.getKey()+" "+m.getValue());
	}

}
