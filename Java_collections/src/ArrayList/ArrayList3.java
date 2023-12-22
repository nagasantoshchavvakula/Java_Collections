//Iterating ArrayList using For-each loop
package ArrayList;

import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list=new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		System.out.println(list);
		
		//Traversing list through for-each loop
		for(String number:list)
			System.out.println(number);
	}

}
