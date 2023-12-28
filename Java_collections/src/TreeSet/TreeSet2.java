//example of traversing elements in descending order.
package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String>list=new TreeSet<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		
		System.out.println("Traversing elements in descending order:");
		Iterator<String>itr=list.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next())  ;
		}
	}

}
