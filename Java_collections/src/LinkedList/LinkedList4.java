//LinkedList example to reverse list of elements 
package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>list=new LinkedList();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		Iterator itr=list.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
