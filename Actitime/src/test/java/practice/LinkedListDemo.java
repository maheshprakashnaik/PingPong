package practice;


import java.util.LinkedList;
import java.util.ListIterator;

class Book
{
	int id;
	String name,author;
	int quantity;

	public Book(int id, String name, String author,int quantity)
	{
		this.id = id;
		this.name = name;
		this.author = author;
		this.quantity = quantity;
	}
}

public class LinkedListDemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Book> list = new LinkedList<Book>();
		Book b1=new Book(121,"applied science","ramesh",2);
		Book b2 =new Book(212,"applied maths","bajirao",3);
		list.add(b1);
		list.add(b2);
		ListIterator itr =list.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		for(Book b:list){  
		    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.quantity);  
		    }
	}

}
