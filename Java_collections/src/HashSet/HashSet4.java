//Java HashSet from another Collection
package HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating Array List
		ArrayList<String>list=new ArrayList<String>();
		  list.add("Ravi");  
          list.add("Vijay");  
          list.add("Ajay"); 
          
         //Creating HashSet
         HashSet<String>set=new HashSet(list);
         set.add("Gaurav");
        
       
         //Traversing the list
         Iterator<String>itr1=list.iterator();
         while(itr1.hasNext()) {
        	 System.out.println(itr1.next());
         }
        //Traversing the set
	 Iterator<String>itr2=set.iterator();
     while(itr2.hasNext()) {
    	 System.out.println(itr2.next());
     }
	} 

}
