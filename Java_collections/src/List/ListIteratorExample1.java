//Example of ListIterator Interface
package List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a List
				List<String>list=new ArrayList<String>();
				
				//Adding elements to the list
				 list.add("Mango");
				 list.add("Apple");  
				 list.add("Banana");  
				 list.add("Grapes"); 
				 
				 ListIterator<String>itr=list.listIterator();
				 System.out.println("Traversing elements in forward direction:");
				 while(itr.hasNext()) {
					 System.out.println("Index:"+itr.nextIndex()+"Value:"+itr.next());
				 }
				 System.out.println("Traversing elements in backward direction:");
				 while(itr.hasPrevious()) {
					 System.out.println("Index:"+itr.previousIndex()+"Value:"+itr.previous());
				 }
	}

}
