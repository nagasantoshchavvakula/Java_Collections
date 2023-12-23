//Java ArrayList example to add elements
package ArrayList;

import java.util.ArrayList;

public class ArrayList7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list1=new ArrayList();
		System.out.println("Initial list of elements: "+list1);  
        //Adding elements to the end of the list 
		list1.add("Ravi");
		list1.add("Vijay");
		list1.add("Ajay");
        System.out.println("After invoking add(E e) method: "+list1);  
        //Adding an element at the specific position  
        list1.add(1, "Gaurav");  
        System.out.println("After invoking add(int index, E element) method: "+list1);  
        ArrayList<String> list2=new ArrayList<String>();  
        list2.add("Sonoo");  
        list2.add("Hanumat");  
        //Adding second list elements to the first list  
        list1.addAll(list2);  
        System.out.println("After invoking addAll(Collection<? extends E> c) method: "+list1);  
        ArrayList<String> list3=new ArrayList<String>();  
        list3.add("John");  
        list3.add("Rahul");  
        //Adding second list elements to the first list at specific position  
        list1.addAll(1, list3);  
        System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+list1);  
		
	}

}
