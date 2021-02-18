import java.util.*;
import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> languages = new HashMap<>();
languages.put(1,"Java");
languages.put(1,"Python");
languages.put(1,"JavaScript");
System.out.println("HashMap:"+languages);

//get() mathod to get value
String value = languages.get(1);
System.out.println("Value at index 1:"+value);;
System.out.println("Value at index 1:"+languages.get(3));

//return set view of keys
System.out.println("Keys: "+ languages.keySet());
//return set views of value
System.out.println("Values: "+ languages.values());

//return set view of key/value pairs
System.out.println("Key/Value mappings: "+ languages.entrySet());




	}

}
