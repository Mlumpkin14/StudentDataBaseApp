package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private String gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	// Constructor: prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter Student Class Level:  ");
		this.gradeYear = in.nextLine();
		System.out.println(firstName + " " + lastName+ " " + " " + gradeYear);
		
		setStudentID();	
		
		
	}
	
	// generate and ID
	private void setStudentID() {
		//Grade level + ID
		id++;
		this.studentID = gradeYear + ""  + id;
		
	}
	
	// Enroll in courses
	public void enroll() {
		//Get inside a loop, user hits 0
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			
			if(!course.equals("Q")) {
				courses = courses + "\n " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else { break; }
		} while (1 != 0);
		
		
	}
	
	// View balance
	public void viewBalance() {
		System.out.println("Your balance is : $" + tuitionBalance);
	}
	 
	// Pay Tuition
	public void payTuition() {
		viewBalance();
		System.out.println("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	 
	// Show Status
	public String showInfo() {
		return "------------" +
				 "\nName: " + firstName +" " + lastName +
				"\n Grade level: " + gradeYear + 
				"\nStudent ID" + studentID +
				"\nCourses Enrolled: " + courses + 
				"\nBalance: $" + tuitionBalance +
				"\n----------";
	}
	
}
