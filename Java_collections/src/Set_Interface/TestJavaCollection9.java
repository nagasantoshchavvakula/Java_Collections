package Set_Interface;

import java.util.Iterator;
//import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestJavaCollection9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String>set=new TreeSet<String>();
		set.add("11");
		set.add("20");
		set.add("3");
		//traversing elements
		Iterator <String>itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
