//Java ArrayDeque Example: offerFirst() and pollLast()
package Dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Deque<String> deque=new ArrayDeque<String>();  
		    deque.offer("arvind");  
		    deque.offer("vimal");  
		    deque.add("mukul");  
		    deque.offerFirst("jai");  
		    System.out.println("After offerFirst Traversal...");  
		    for(String s:deque){  
		        System.out.println(s);  
		    }  
		    //deque.poll();  
		    //deque.pollFirst();//it is same as poll()  
		    deque.pollLast();  
		    System.out.println("After pollLast() Traversal...");  
		    for(String s:deque){  
		        System.out.println(s); 
		    }
		}
}
