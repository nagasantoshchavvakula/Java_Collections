package JavaEnumSetClass;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days{
	 SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
}
public class EnumSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Set<days> Days = EnumSet.of(days.TUESDAY, days.THURSDAY);  
	    // Traversing elements  
	    Iterator<days> itr = Days.iterator();  
	    while (itr.hasNext())  
	      System.out.println(itr.next());  
	}

}
