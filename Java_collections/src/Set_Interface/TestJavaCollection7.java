package Set_Interface;

import java.util.HashSet;
import java.util.Iterator;

public class TestJavaCollection7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>str=new HashSet<String>();
		str.add("1");
		str.add("2");
		str.add("3");
		Iterator <String>itr=str.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
