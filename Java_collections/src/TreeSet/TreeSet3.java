//example to retrieve and remove the highest and lowest Value.
package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer>number=new TreeSet<Integer>();
		number.add(10);
		number.add(15);
		number.add(20);
		number.add(2);
		number.add(0);
		System.out.println("Numbers are:"+number);
		//Traversing
		Iterator<Integer>itr=number.iterator();
		for(Integer I:number)
			System.out.println(I);
		//Printing highest and lowest values
		System.out.println("Highest value:"+number.pollLast());
		System.out.println("Lowest value:"+number.pollFirst());
	}

}
