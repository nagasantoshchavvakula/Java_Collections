//Example to remove()elements
package HashMap;

import java.util.HashMap;

public class HashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    HashMap<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"Amit");    
	      map.put(101,"Vijay");    
	      map.put(102,"Rahul");  
	      map.put(103, "Gaurav");  
	    System.out.println("Initial list of elements: "+map);  
	    //key-based removal  
	    map.remove(100);  
	    System.out.println("Updated list of elements: "+map);  
	    //value-based removal  
	    map.remove(101);  
	    System.out.println("Updated list of elements: "+map);  
	    //key-value pair based removal  
	    map.remove(102, "Rahul");  
	    System.out.println("Updated list of elements: "+map);
	}

}
