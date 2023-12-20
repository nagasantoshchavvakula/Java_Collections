package ArrayList;

import java.util.Iterator;
import java.util.LinkedList;

public class TestJavaCollection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>list=new LinkedList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		Iterator<String>itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
