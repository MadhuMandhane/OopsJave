import java.util.ArrayList;

public class ComparatorDemo {

	public static void main(String[] args) {
		
		ArrayList<Student5> ar=new ArrayList<Student5>();
		Student5 s1=new Student5(111,"John","Bengaluru");
		Student5 s2=new Student5(111,"Allan","Mumbai");
		Student5 s3=new Student5(111,"Mike","New York");
		Student5 s4=new Student5(111,"Sam","Bengaluru");

		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		ar.add(s4);
	System.out.println("unsorted array list: ");
	System.out.println(ar);
	}

}
