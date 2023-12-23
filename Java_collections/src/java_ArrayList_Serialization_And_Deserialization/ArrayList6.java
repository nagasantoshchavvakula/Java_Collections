package java_ArrayList_Serialization_And_Deserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;


public class ArrayList6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list=new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		
		try {
			//Serialization
			FileOutputStream fos=new FileOutputStream("file");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			  oos.writeObject(list);  
              fos.close();  
              oos.close();
              
             //Deserialization
             FileInputStream fis=new FileInputStream("file");
             ObjectInputStream ois=new ObjectInputStream(fis);
             ArrayList  list1=(ArrayList)ois.readObject();  
             System.out.println(list1); 
		}catch(Exception e){
			System.out.println(e);
		}
		//traversing the elements
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
