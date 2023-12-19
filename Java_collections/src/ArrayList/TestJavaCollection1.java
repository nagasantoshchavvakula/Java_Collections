package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class TestJavaCollection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list=new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		System.out.println(list);
		
		//Traversing list through iterator
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
