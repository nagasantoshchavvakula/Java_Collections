//Java ArrayList example of isEmpty() method
package ArrayList;

import java.util.ArrayList;

public class ArrayList10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list=new ArrayList();
		System.out.println("is ArrayList Empty:"+list.isEmpty());
		list.add("Ravi");  
		list.add("Vijay");  
		list.add("Ajay"); 
		System.out.println("After Insertion:"+list);
		//list.clear();
		System.out.println("is ArrayList Empty:"+list.isEmpty());
	}

}
