//example of List where we are using the ArrayList class as the implementation
package List;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating a List
		List<String>list=new ArrayList<String>();
		
		//Adding elements to the list
		 list.add("Mango");
		 list.add("Apple");  
		 list.add("Banana");  
		 list.add("Grapes"); 
		 
		//Iterating the List element using for-each loop
		 for(String fruit:list)
			 System.out.println(fruit);
	}

}
