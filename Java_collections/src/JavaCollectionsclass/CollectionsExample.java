package JavaCollectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> list = new ArrayList<String>();  
        list.add("C");  
        list.add("Core Java");  
        list.add("Advance Java");  
        System.out.println("Initial collection value:"+list);  
        Collections.addAll(list, "Servlet","JSP") ; 
        System.out.println("After adding elements collection value:"+list);  
        String[]strr= {"C#", ".Net"} ; 
        Collections.addAll(list, strr);  
        System.out.println("After adding array collection value:"+list);  
	}

}
