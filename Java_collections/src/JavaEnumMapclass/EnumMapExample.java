package JavaEnumMapclass;

import java.awt.List;
import java.util.EnumMap;
import java.util.Map.Entry;

public class EnumMapExample {

	public enum Days{
		 Monday, Tuesday, Wednesday, Thursday 
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumMap<Days,String>days=new EnumMap<Days,String>(Days.class);
		days.put(Days.Monday,"1");
		days.put(Days.Tuesday,"2");
		days.put(Days.Wednesday,"3");
		days.put(Days.Thursday,"4");
		
		//Printing
		for(Entry<Days, String> m:days.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
