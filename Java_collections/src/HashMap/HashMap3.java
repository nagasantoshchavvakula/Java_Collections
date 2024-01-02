//Java HashMap example to replace() elements
package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashMap<Integer,String>list=new HashMap<Integer,String>();	
	list.put(100, "Amit");
	list.put(101, "Vijay");
	list.put(102, "Rahul");
	System.out.println("After adding elements:");
	for(Entry<Integer, String> m:list.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
		}
	list.replace(102, "Gaurav");//replacing an element
	System.out.println("After replacing an element:");
	for(Entry<Integer, String> m:list.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
		}
	list.replace(101, "Vijay", "Ravi");//replacing old value with new value
	System.out.println("After replacing old value with new value:");
	for(Entry<Integer, String> m:list.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
		}
	list.replaceAll((k,v)->"Ajay");//replacing all with the same value
	System.out.println("After replacing all with the same value:");
	for(Entry<Integer, String> m:list.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
