class Specialist extends Doctor
 {
Specialist()
{
	
}
Specialist(final String str, final int num, final String addr, final String special)
{
	super(str,num,addr);
	speciality= special;
}

void display() {
	super.display();//call base class method
	System.out.println("The speciality is:"+speciality);
	
}
