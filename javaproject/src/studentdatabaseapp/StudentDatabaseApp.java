package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		//ask how many students we want to add
		System.out.println("ENTER NUMBER OF NEW STUDENTS TO ENROLL");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		
		Student[] students = new Student[numOfStudents];
		
		//Create n no of new students 
		
		for(int i = 0 ; i < numOfStudents ; i++)
		{
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			
			
		}
		
		for(int i = 0 ; i < numOfStudents ; i++)
		{
			System.out.println(students[i].showInfo());
			
		}
		
	}

}
