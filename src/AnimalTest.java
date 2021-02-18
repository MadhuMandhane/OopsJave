class Animal{ //base class
	String name;
	public void eat()//method // as every animal can eat its a common thing so displayed in base class
	{
		System.out.println("I can eat ");
	}
}
class Dog extends Animal//inherited from animal
{
	//new method in subclass
	public void display()
	{
		System.out.println("My name is "+name);
	}
}
public class AnimalTest {

	public static void main(String[] args) {
		
//create an obj of subclass
		Dog labrador = new Dog();
	//access field of superclass
	labrador.name="Rohu";
	labrador.display();
	labrador.eat();
	}

}
