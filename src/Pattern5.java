public class Pattern5 {
	 // method without parameter
	  public void display() {
	    for (int i = 0; i < 30; i++) {
	      System.out.print("*");
	    }
	  }

	  // method with single parameter
	  public void display(char symbol) {
	    for (int i = 0; i < 30; i++) {
	      System.out.print(symbol);
	    }
	  }
	public static void main(String[] args) {
		Pattern5 d1 = new Pattern5();

	    // call method without any argument
	    d1.display();
	    System.out.println("\n");

	    // call method with a single argument
	    d1.display('#');

	}

}
