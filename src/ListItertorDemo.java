import java.util.ArrayList;
import java.util.ListIterator;
import java.util.*;
public class ListItertorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>al=new ArrayList<String>();
al.add("Jim");
al.add("Jerry");
al.add("John");
al.add(1,"Jive");
System.out.println("element at 2nd position:"+al.get(2));
ListIterator<String>itr=al.listIterator();
System.out.println("traversing element in forward direction..");
while(itr.hasPrevious())
{
	System.out.println(itr.previous());
}

	}

}
