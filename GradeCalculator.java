/*
 * Assignment 2 - GradeCalculator
 * Author: Adam Plater-Zyberk(040922567)
 * CST8110_301
 */
import java.util.Scanner;
//creating class "GradeCalculator"
public class GradeCalculator {
	
	//creating new scanner class named "input"
	Scanner input = new Scanner(System.in);
	
	//declaring instance variables of student information inputs
	private String stuName;
	private int stuID;
	private float lab;
	private float assignment;
	private float midtermExam;
	private float labFinal;
	private float finalExam;
	private float quiz;
	private float examGrade;
	private float practicalGrade;
	private float totalGrade;
	private String result; 
	
	//creating method to print title statement which includes course number and author name
	public void title() {
	
		System.out.println("The grade calculator of CST8110. Prepared by Adam Plater-Zyberk.");
	}	
	//creating method that collects the student name, ID, and all different marks
	public void getStudentDetails(){
		
		//prompting user to input all student information by individual student
		System.out.print("\nEnter student name: ");
		stuName = input.nextLine();
		System.out.print("Enter student ID: ");
		stuID = input.nextInt();
		System.out.print("Enter lab marks between 0 and 15: ");
		lab = input.nextFloat();
		System.out.print("Enter assignment marks between 0 and 10: ");
		assignment = input.nextFloat();
		System.out.print("Enter midterm marks between 0 and 20: ");
		midtermExam = input.nextFloat();
		System.out.print("Enter lab final marks between 0 and 25: ");
		labFinal = input.nextFloat();
		System.out.print("Enter final exam marks between 0 and 25: ");
		finalExam = input.nextFloat();
		System.out.print("Enter quiz marks between 0 and 5: ");
		quiz = input.nextFloat();
		
	}
	//creating method that calculates student average of practical, exam, and final grades
	public void calculateGrades() {
		
		//calculating averages and determining pass/fail result
		practicalGrade = ((assignment + lab)/25 * 100);
		examGrade = ((labFinal + midtermExam + finalExam)/70 * 100);
		totalGrade = ((quiz+assignment+lab+labFinal+midtermExam+finalExam));
		if ((practicalGrade >= 50) && (examGrade >= 50) && (totalGrade >= 50)) {
		result = "PASS";
		} else {
		result = "FAIL";
		}
	}
		
	//creating method that prints student info, student averages by category, and "pass or fail" result
	public void printStudentGrades() {
		
		System.out.printf("%16s|%6d|%17.2f|%12.2f|%13.2f|%8s%n",stuName,stuID,practicalGrade,examGrade,totalGrade,result);
			
		
	}// end of methods 

}//end of class

