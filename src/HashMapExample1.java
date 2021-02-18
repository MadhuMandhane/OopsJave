import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class HashMapExample1 {

	private static final int Integer = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,Book> mapBook =new HashMap<Integer,Book>();
		//creating books
		 Book1 b1=new Book1(101,"Let us C","Yashwant Kanetkar","BPB",8);
		    Book1 b2=new Book1(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
		    Book1 b3=new Book1(103,"Operating System","Galvin","Wiley",6);
		   
		    //add books to map
		    mapBook.put(1, b1);
		    mapBook.put(1, b2);
		    mapBook.put(1, b3);
		    
		    //traverse the map
		    System.out.println("BookId"\t);
		    for(Map.Entry<Integer,Book> e:mapBook.entrySet())
		    {
		    	int key=e.getKey();
		    	Book b=e.getValue();
		    	System.out.println("Book1"+key+"Details");
		    	System.out.println(b.id+" "+b.author+" "+b.publisher+" "+b.quantity);
		    	System.out.println();
		    }
	}

}
