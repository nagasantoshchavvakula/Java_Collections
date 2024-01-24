package JavaEnumSetClass;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetExample2 {

	enum days{
		 SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<days>Days1=EnumSet.allOf(days.class);
		System.out.println("Week Days"+Days1);
		
		Set<days>Days2=EnumSet.noneOf(days.class);
		System.out.println("Week Days"+Days2);
		
		
	}

}
