package Queue_Interface;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestJavaCollection6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String>deque=new ArrayDeque<String>();
		deque.add("Gautam");  
		deque.add("Karan");  
		deque.add("Ajay"); 
		for(String str:deque) {
			System.out.println(str);
		}
		
	}

}
