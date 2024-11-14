

import java.util.ArrayList;
import java.util.Iterator;

public class AddDataToArrayList {
	public ArrayList<Book> boodetails(){
		ArrayList<Book> list = new ArrayList<Book>();
	      Book b1 = new  Book(1, "Death note", "John", "cartoon");
	      Book b2 = new Book(2, "Stranger Things", "brothers", "suspense");
	      Book b3 = new Book(3, "Spider man", "Alex", "Kids");
	      Book b4 = new Book(4, "GentleMen", "Max", "Action");
	      // Passing data using setter
	      Book b5 = new Book(0, null, null, null);
	      b5.setNumber(5);
	      b5.setName("Java FullStack");
	      b5.setAuthor("Flex");
	      b5.setCategory("Programming");
	     // Adding Books objects to Arraylist
	     list.add(b1);
	     list.add(b2);
	     list.add(b3);
	     list.add(b4);
	     list.add(b5);
	     return list;
	   }
	}