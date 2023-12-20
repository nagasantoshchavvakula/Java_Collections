package ArrayList;

import java.util.Iterator;
import java.util.Stack;

public class TestJavaCollection4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String>stack=new Stack<String>();
		stack.push("One");
		stack.push("Two");
		stack.push("Three");
		stack.push("Four");
		stack.push("Five");
		stack.pop();
		stack.push("Six");
		Iterator<String>itr=stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
