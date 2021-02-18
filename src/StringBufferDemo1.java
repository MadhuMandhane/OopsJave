import java.util.Scanner;
public class StringBufferDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer str = new StringBuffer("JamesGosling");
int l=str.length();
System.out.println("The length of the string is :"+l);
System.out.println("The capacity of string is:"+str.capacity());
//16+12=28...16 is size of empty string buf nd 12 is of james gosling
System.out.println("the substring:"+str.substring(0, 4));//0 to 3 charecter will be displayed
	str.replace(5, 10, "Java");
	System.out.println(str);
	str.delete(2, 5);
	System.out.println(str);
	System.out.println("The reversed string:"+str.reverse());
	}

}
