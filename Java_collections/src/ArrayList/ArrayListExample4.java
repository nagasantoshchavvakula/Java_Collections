//Get and Set ArrayList

package ArrayList;

import java.util.ArrayList;

public class ArrayListExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list=new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		
		 //accessing the element 
		System.out.println("Returning element:"+list.get(1));
		
		 //changing the element 
		list.set(1, "Seven");
		System.out.println("Returning element:"+list.get(1));
		
		//Traversing list through for-each loop
		for(String number:list)
			System.out.println(number);
	}

}
