
public class Complex {
	double real;
	double imaginary;
	
	public Complex(double r, double i)
	{
		real=r;
		imaginary=i;
	}
	void add(Complex obj2)//method
	{
		this.real += obj2.real;//addition of obj1 real to obj2 real
		this.imaginary += obj2.imaginary;//this refers to obj1
		// here += is a compound assignment operator
	}
	void display()//method
	{
		System.out.println(this.real+"+i"+this.imaginary);
	
	}

	public static void main(String[] args) {
		Complex obj1= new Complex(10.3, 67.4);
		Complex obj2= new Complex(0.7,3.6);
		
		obj1.add(obj2);//calling add method // object passed as arguement here
		System.out.println("The addition of the complex number is");
		obj1.display();

	}

}
