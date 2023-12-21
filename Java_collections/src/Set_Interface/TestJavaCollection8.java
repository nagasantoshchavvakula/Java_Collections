package Set_Interface;

//import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestJavaCollection8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String>set=new LinkedHashSet<String>();
		set.add("1");
		set.add("2");
		set.add("3");
		Iterator <String>itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
