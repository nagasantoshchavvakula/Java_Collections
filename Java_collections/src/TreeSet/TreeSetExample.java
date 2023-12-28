//TreeSet example where we are adding books to the set and printing all the books
package TreeSet;

import java.util.*;



class Book implements Comparable<Book>{
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
	//elements in TreeSet must be of a Comparable type
	public int compareTo(Book b){
	    if(id>b.id){    
	        return 1;    
	    }else if(id<b.id){    
	        return -1;    
	    }else{    
	    return 0;    
	    }  
	}
	
}

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Book>list=new TreeSet<Book>();
		 //Creating Books  
	    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
	    Book b2=new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);  
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
	    //Adding Books to list  
	    list.add(b1);  
	    list.add(b2);  
	    list.add(b3);  
	    //Traversing list  
	    for(Book b:list){  
	        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity); 
	    }
	}

}
