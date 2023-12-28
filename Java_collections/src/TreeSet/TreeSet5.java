//Various Sorted Set Operations
package TreeSet;

import java.util.TreeSet;

public class TreeSet5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  TreeSet<String> set=new TreeSet<String>();  
	         set.add("A");  
	         set.add("B");  
	         set.add("C");  
	         set.add("D");  
	         set.add("E");  
	           
	         System.out.println("Intial Set: "+set);  
	           
	         System.out.println("Head Set: "+set.headSet("C"));  
	          
	         System.out.println("SubSet: "+set.subSet("A", "E"));  
	           
	         System.out.println("TailSet: "+set.tailSet("C")); 
	}

}