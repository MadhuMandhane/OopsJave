import java.util.Scanner;

class Area {
  
	   int length,width;
	   Area(int l, int w)
	   {
		   length=l;
		   width=w;	  
	   }
	 
	   public int returnArea()
	   {
		   return length*width;
	   }
}
     class Cal{
	   public static void main (String[] args)
	   {
	  Scanner s = new Scanner(System.in);
	  int l,w;
	  System.out.println("Enter length: ");
	  l = s.nextInt();
	  System.out.println("enter width: ");
	  w = s.nextInt();
	  
	  Area a = new Area(l,w);
	  System.out.println("Area:"+a.returnArea());
	   }   
	
   }
