package LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //Creating HashSet and adding elements  
        LinkedHashSet<String> set=new LinkedHashSet<String>();  
               set.add("One");    
               set.add("Two");    
               set.add("Three");   
               set.add("Four");  
               set.add("Five");  
               Iterator<String> itr=set.iterator();
               System.out.println("Elements ordered using while loop:");
               while(itr.hasNext())  
               {  
               System.out.println(itr.next());  
               } 
               System.out.println("Elements ordered using for loop:");
               for(String num:set)//Note: We can also use the enhanced for loop for displaying the elements.          
            	   System.out.println(num);
	}

}
