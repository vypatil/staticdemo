package com.demo.CollectionFramework;
import java.util.*;

	class Book{
		
		int id;
		String name,author,publisher;
		public Book(int id, String name, String author, String publisher) {
			super();
			this.id = id;
			this.name = name;
			this.author = author;
			this.publisher = publisher;
		}
		
	}

public class linkedhashsetbookdemo {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Book> obj = new LinkedHashSet<Book>();
		
		Book b1 = new Book(100 , "Marathi" ,"Dr.j patil" , "Mehta" );
		Book b2 = new Book(101 , "Grammer" ,"Kulkarni" , "Loyyds" );
		Book b3 = new Book(102 , "Novel" ,"Savarkar" , "Balbharti" );
		
		obj.add(b1);
		obj.add(b2);
		obj.add(b3);
		
		for(Book b:obj) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher);
		}
	
		}
	}
		
		
	
	


