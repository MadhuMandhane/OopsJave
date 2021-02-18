//overriding
class Bank
{
	int getRateOfIntrest(){return 0;}
	

}
class SBI extends Bank
{
	int getRateOfIntrest(){return 8;}
}
class ICICI extends Bank
{
	int getRateOfIntrest(){return 7;}
}
class AXIS extends Bank
{
	int getRateOfIntrest(){return 9;}
}
public class OverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s=new SBI();
		ICICI i=new ICICI();
		AXIS a=new AXIS();

		System.out.println("SBI Rate of Intrest: "+s.getRateOfIntrest());
		System.out.println("ICICI Rate of Intrest: "+i.getRateOfIntrest());
		System.out.println("AXIS Rate of Intrest: "+a.getRateOfIntrest());
	}

}
