//ArrayToListExample
package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array[]={"Java","Python","PHP","C++"};
		System.out.println("Printing array:"+Arrays.toString(array));
		
		//converting array to list
		List<String>list=new ArrayList<String>();
		for (String lang:array)
			list.add(lang);
			System.out.println("Print list:"+list);

	}

}
