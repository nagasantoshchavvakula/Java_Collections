//Get and Set Element in List
package List;

import java.util.ArrayList;
import java.util.List;

public class ListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list=new ArrayList<String>();
		
		//Adding elements to the list
		 list.add("Mango");
		 list.add("Apple");  
		 list.add("Banana");  
		 list.add("Grapes"); 
		 
		 System.out.println("The element is:"+list.get(1));//returns the element based on given index value
		 //changing the element
		 list.set(1, "Dates");
		 
		 
		//Iterating the List element using for-each loop
		 for(String fruit:list)
			 System.out.println(fruit);
	}

}
