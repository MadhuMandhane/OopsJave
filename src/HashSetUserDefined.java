import java.util.TreeSet;
import java.util.HashSet;
import java.util.Set;
public class HashSetUserDefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Set<Employee44> empset=new HashSet<Employee44>();
      Employee44 e1=new Employee44(100,"John",5000);
      Employee44 e2=new Employee44(100,"Mike",7000);
      Employee44 e3=new Employee44(100,"Raj",6000);
      Employee44 e4=new Employee44(100,"John",5000);
      
      empset.add(e1);
      empset.add(e2);
      empset.add(e3);
      empset.add(e4);
      
      for(Employee44 e:empset)
      {
    	  System.out.println(e.id+" "+e.name+" "+e.sal);
    	  
      }
	}

}
