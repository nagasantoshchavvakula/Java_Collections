//HashSet example to remove elements
package HashSet;

import java.util.HashSet;

public class HashSet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  HashSet<String> list=new HashSet<String>();  
		  list.add("Ravi");  
		  list.add("Vijay");  
		  list.add("Arun");  
		  list.add("Sumit");  
          System.out.println("An initial list of elements: "+list);  
          
          //Removing specific element from HashSet  
          list.remove("Ravi");  
          System.out.println("After invoking remove(object) method: "+list);  
          HashSet<String> list1=new HashSet<String>();  
          list1.add("Ajay");  
          list1.add("Gaurav");  
          list.addAll(list1);  
          System.out.println("Updated List: "+list);  
          
          //Removing all the new elements from HashSet  
          list.removeAll(list1);  
          System.out.println("After invoking removeAll() method: "+list); 
          
          //Removing elements on the basis of specified condition  
          list.removeIf(str->str.contains("Vijay"));    
          System.out.println("After invoking removeIf() method: "+list);
          
          //Removing all the elements available in the set  
          list.clear();  
          System.out.println("After invoking clear() method: "+list);
	}

}
