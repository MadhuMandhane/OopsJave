
public class Doctor {
protected String name;
protected int idNumber;
protected String address;

Doctor()
{
	
}
Doctor(final String str, final int num, final String addr)
{
	name = str;
	idNumber = num;
	address = addr;
}

void display()//method
{
	System.out.println("The name is:"+name);
	System.out.println("The number is:"+idNumber);
	System.out.println("The address is:"+address);
	
}
}
