//Java Linked hashMap Example book
package LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

//import ArrayList.Book;

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
public class MapExample_Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating map of books
		LinkedHashMap<Integer,Book>list=new LinkedHashMap<Integer,Book>();
		
		//Creating books
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
		Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
		Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
		
		//Adding books to map
		list.put(1,b1);
		list.put(2,b2);
		list.put(3,b3);
		
		//traversing map
		for(Entry<Integer, Book> m:list.entrySet()) {
			int key=m.getKey();  
		    Book b=m.getValue(); 
			System.out.println(key+"Details");
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}

}
