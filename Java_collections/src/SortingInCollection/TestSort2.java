package SortingInCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();  
		al.add("Viru");  
		al.add("Saurav");  
		al.add("Mukesh");  
		al.add("Tahir");  
		//al.add("Vikas");
		  
		Collections.sort(al,Collections.reverseOrder());  
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());
		}
	}

}
