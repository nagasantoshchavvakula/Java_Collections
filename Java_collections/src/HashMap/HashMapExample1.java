//simple example of HashMap to store key and value pair.
package HashMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class HashMapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating HashMap
		HashMap<Integer,String>list=new HashMap<Integer,String>();
		//Adding elements
		list.put(1, "Ram");
		list.put(2, "Laxman");
		list.put(1, "Hanuman");
		System.out.println("Iterating elements..");
		for(Entry<Integer, String> M: list.entrySet()) 
			System.out.println(M.getKey()+" "+M.getValue());
	}

}
