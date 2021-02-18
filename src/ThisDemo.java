
public class ThisDemo {
int instVar;

ThisDemo(int instVar)//constructor
{
	this.instVar=instVar;
	System.out.println("this reference="+this);//+this for memory location which will be same as obj
	
}
	public static void main(String[] args) {
	ThisDemo obj= new ThisDemo(8);//obj created nd invokes constructor automatically
	System.out.println("object reference="+obj);
	}

}
//prints the memory location of the object