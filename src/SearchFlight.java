
import java.util.Scanner;
import java.util.*;
public class SearchFlight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String from, to, flight;
		 int choice,year,month,day;
			
		
			System.out.println("press 1- for International flight");
			System.out.println("press 2- for Domestic flight");
			Scanner in = new Scanner(System.in);
			System.out.println("Enter proper choice");
			choice = in.nextInt();
	switch(choice) {
	
	case 1:
		flight="International";
		System.out.println("Source:");
	    from = in.next();
		System.out.println("Destination:");
	    to = in.next();
		break;
		
		case 2:
			flight="Domestic";
			System.out.println("Source:");
			from = in.next();
			System.out.println("Destination");
			to = in.next();
			break;
			
	    default:
	    	System.out.println("Enter proper choice");
	    		
	}
	Scanner dt = new Scanner(System.in);
	 System.out.println("Enter the date of traveling");
		int date = dt.nextInt();
	
	System.out.println("These are the available flights:");
	}

}
