
public class ConstructorDemo {
	int id;
	ConstructorDemo()//default constructor
	{
		System.out.println("In constructor");
		id=10;
	}
    void display()
    {
    	System.out.println(id);
    }
	public static void main(String[] args) {
		ConstructorDemo obj1=new ConstructorDemo();
		//obj created and it invokes constructor automatically
		ConstructorDemo obj2=new ConstructorDemo();
		obj1.display();
	}

}
