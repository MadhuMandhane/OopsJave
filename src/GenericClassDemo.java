class Sample<T>//generic class
{
	private T data;

	public Sample(T data) {
		super();//calling base class constructor
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}
public class GenericClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sample<Integer> s1 = new Sample<Integer>(15);//creating a object of generic class
//s1.setData(15);
System.out.println("display generic class of type integer:"+s1.getData());

Sample<String> s2 = new Sample<String>("java generics");//creating a object of generic class
//s2.setData("Java Generics");
System.out.println("display generic class of type string:"+s2.getData());

Sample<Float> s3 = new Sample<Float>(120.35f);//creating a object of generic class
//s3.setData(120.35f);
System.out.println("display generic class of type float:"+s3.getData());
	}

}
