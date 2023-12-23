//Java LinkedList example to add elements
package LinkedList;

import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>list1=new LinkedList();
		list1.add("Ravi");
		list1.add("Vijay");
		list1.add("Ajay");
		System.out.println("After Inserting elements:"+list1);
		
		//Adding an element at the specific position 
		list1.add(1, "Gaurav");
		System.out.println("After invoking element to index1:"+list1);
		
	    //Adding second list elements to the first list
		LinkedList<String>list2=new LinkedList();
		list2.add("Sonu");
		list2.add("Hanumant");
		list1.addAll(list2);
		//System.out.println("After Inserting elements:"+list2);
		
		System.out.println("After Inserting elements:"+list1);
		
		 //Adding Third list elements to the first list
		LinkedList<String>list3=new LinkedList();
		list3.add("John");
		list3.add("Rahul");
		list1.addAll(1,list3);
		//System.out.println("After Inserting elements:"+list3);
		
		System.out.println("After Inserting elements:"+list1);
		list1.addFirst("Lokesh");
		System.out.println("After Inserting elements:"+list1);
		
	    //Adding second list elements to the first list at specified location
		//list2.add(1, "");
		
		
	}

}
