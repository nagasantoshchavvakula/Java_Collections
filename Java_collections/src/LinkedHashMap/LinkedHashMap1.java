package LinkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String>list=new LinkedHashMap<Integer,String>();
		
		//Adding elements
		list.put(100, "Amit");
		list.put(101, "Vijay");
		list.put(102, "Rahul");
		
		//Fetching keys
		System.out.println("Keys:"+list.keySet());
		
		//Fetching values
		System.out.println("Keys:"+list.values());
		
		//Fetching keyvalue-pairs 
		System.out.println("Keys:"+list.entrySet());
	}

}
