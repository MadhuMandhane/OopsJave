import java.util.Scanner;

class Trainee//class declaration
{
int tId;//defineing properties
String tName;
String technology;
float salary,stipend;
//now defineing methods
void input()
{
  Scanner s=new Scanner(System.in);
  System.out.println("Enter Id, Name, Technology and Salary of a trainee");
  tId=s.nextInt();
  tName=s.next();
  technology=s.next();
  salary=s.nextFloat();//all inputs
}
float calculate()//method
{
stipend=salary-200;
return stipend;
}
void display()//one more method
{
	System.out.println("********Trainee Details********");
	System.out.println("Trainee Id:"+tId);
	System.out.println("Trainee Name:"+tName);
	System.out.println("Technology:"+technology);
	//System.out.println("Stipend:"+salary);//diplay
}
}
public class TestTrainee { //main class

	public static void main(String[] args) {
		//encapsulation nd abstraction example
		Trainee t1=new Trainee();//creating objects
		Trainee t2=new Trainee();
		t1.input();//method call for this class
		t2.input();
		
		float s1=t1.calculate();//calling to method calculate
		float s2=t2.calculate();
		
		t1.display();//t1 is obj
		System.out.println("stipend   :"+s1);
		t2.display();
		System.out.println("stipend   :"+s2);
	}//program execution...bottom top approach

}
