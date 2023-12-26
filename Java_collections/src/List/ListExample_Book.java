package List;

import java.util.ArrayList;
import java.util.List;

//import ArrayList.Book;

class Book {
	int id;
	String name,author,publisher;
	int quantity;
	
	public Book(int id,String name,String author,String publisher,int quantity)
		// TODO Auto-generated constructor stub
		{
			
			this.id=id;
			this.name=name;
			this.author=author;
			this.publisher=publisher;
			this.quantity=quantity;
		}

	}

public class ListExample_Book {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating list of Books
		List<Book>list=new ArrayList<Book>();
		
		 //Creating Books
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
		Book b2=new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);
		Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
		
		//Adding Books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		//Traversing
		for(Book b:list) 
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
	}

}




