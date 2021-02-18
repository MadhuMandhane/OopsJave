import java.util.Scanner;

public class TopStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.print("enter the number of students");
int numOfStudents=input.nextInt();
System.out.print("Enter student name:");
String Student1=input.next();
System.out.print("Enter student Rollno:");
int Rollno1=input.nextInt();
System.out.print("Enter student course:");
String course1=input.next();
System.out.print("Enter student score:");
double score1=input.nextDouble();
for (int i=0;i<numOfStudents-1;i++)
{
	System.out.println("Enter student name:");
	String student=input.next();
	System.out.print("Enter student Rollno:");
	int Rollno=input.nextInt();
	System.out.print("Enter student course:");
	String course=input.next();
	System.out.println("Enter student score:");
	double score=input.nextDouble();
	if(score>score1)
	{
		Student1=student;
		score1=score;
	
	}
}
System.out.println("name of student with highest score is: " +Student1);
System.out.println("highest score is: " +score1);
	}

}
