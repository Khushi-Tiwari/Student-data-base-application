package studentdatabaseapp;
import java.util.Scanner;

public class Student {
	
	private String firstName ;
	private String lastName;
	private int gradeYear;
	private String studentID ;
	private String courses= "";
	private int tutionBalance =0;
	private static int costOfCourse = 600 ;
	private static int id = 1000 ;
	
	
	
	//Constructor: promt user to enter students name and year
	
	public Student()
	{
		Scanner in = new Scanner (System.in);
		System.out.print("Enter student first name :");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name :");
		this.lastName = in.nextLine();
		
		System.out.print(" 1 - BCA\n 2 - MCA\n 3- BTECH\n 4- MBA\n Enter student class level  :");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
		
		
		
		
		
	}
	
	
	//Generate an ID 
	
	private void setStudentID ()
	{
		//Grade level + ID 
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	// Enroll in courses
	public void enroll ()
	{
		//get inside a loop ,user hits 0
		do
		{
		System.out.print("\nEnter course to enroll or Q to quit :");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if(!course.equals("Q"))
		{
			courses = courses + "\n " + course ;
			tutionBalance =  tutionBalance + costOfCourse;
			
		}
		else {
			
			break;
			}
		}while(1!=0);
		
		
		
	}
	
	// View balance 
	public void viewBalance()
	{
		System.out.print("\nYour balance is : Rs " + tutionBalance);
	}
	
	//Pay tution 
	public void payTuition()
	{
		viewBalance();
		System.out.print("\nEnter your payment : ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tutionBalance = tutionBalance - payment;
		System.out.println("Thankyou for your payment of Rs  "+ payment);
		viewBalance();
	}
	
	//Show status 
public String showInfo()
{
	return "\n NAME - " +firstName + " " + lastName +
			"\n GRADE LEVEL - " + " " + gradeYear +
			"\n STUDENT ID - " + studentID +
			"\n\nCOURSES ENROLLED - " + "  " + courses +
			"\nBALANCE - Rs " + tutionBalance ;
			
}
	
}
