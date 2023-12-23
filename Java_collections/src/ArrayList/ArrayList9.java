//Java ArrayList example of retainAll() method
package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list=new ArrayList();
		list.add("Ravi");  
		list.add("Vijay");  
		list.add("Ajay"); 
		ArrayList<String>list2=new ArrayList();
		list2.add("Ravi");
		list2.add("Hanumant");
		list.retainAll(list2);
		System.out.println("iterating the elements after retaining the elements of al2"); 
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
