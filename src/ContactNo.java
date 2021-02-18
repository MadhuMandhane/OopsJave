public class ContactNo {
	 // method without parameter
	   void CreateContact(String name,long num1) {
	    System.out.println("name of person is: "+name);
	    System.out.println("contact no. is: "+num1);
	  }

	  // method with single parameter
	   void CreateContact(String name,long num1,long num2) {
	   System.out.println("name of person is: "+name);
	   System.out.println("first contact n0. is: "+num1);
	   System.out.println("second contact no. is: "+num2);
	  }
	public static void main(String[] args) {
		ContactNo c1 = new ContactNo();

	    // call method without any argument
	    c1.CreateContact("madhu",9130133098L);
	    c1.CreateContact("raghu",9130133444L,9130644578L);
	    System.out.println("\n");

	    // call method with a single argument
	   

	}

}
