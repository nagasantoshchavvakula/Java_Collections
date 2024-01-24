package JavaHashtable;

import java.util.TreeMap;
import java.util.Hashtable;
import java.util.Map.Entry;

//import JavaTreeMap.Book;
class Book{
	int id;
	String name,author,publisher;
	int quantity;
	public Book(int id, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	
}
public class HashtableExample_Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating Map for Books
				Hashtable<Integer,Book>list=new Hashtable<Integer,Book>();
				
				//Creating Books
				Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
			    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
			    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
			    
				//Adding books
				list.put(2,b2);
				list.put(1,b1);
				list.put(3,b3);
				
				//Traversing 
				for(Entry<Integer, Book> entry:list.entrySet()) {
					int key=entry.getKey();
					Book b=entry.getValue();
					System.out.println(key+" "+"Details");
					System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
				}
				
				 int a=20;
				 int b;
				 int c=(a++  - --a + ++a );
				//  
				 System.out.println(c);
	}

}
