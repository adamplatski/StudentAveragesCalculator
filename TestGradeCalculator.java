		/*
		 * Assignment 2 - TestGradeCalculator
		 * Author: Adam Plater-Zyberk(040922567)
		 * CST8110_301
		 */
		//creating class "TestGradeCalculator"
		public class TestGradeCalculator {
			
			//creating main method
			public static void main(String[] args) {
				
				//creating new object name of the class "GradeCalculator" to call title method
				GradeCalculator GradeCalc = new GradeCalculator();
				
				//calling title method with new object name to print title statement
				GradeCalc.title();
				
				//creating new object name for student1 to call getStudentDetails method and compile student 1 info
				GradeCalculator student1 = new GradeCalculator();
				student1.getStudentDetails();
				
				//creating new object name for student 2 to call getStudentDetails method and compile student 2 info 
				GradeCalculator student2 = new GradeCalculator();
				student2.getStudentDetails();
				
				//creating new object name for student 3 to call getStudentDetails method and compile student 3 info
				GradeCalculator student3 = new GradeCalculator(); 
				student3.getStudentDetails();
				
				
				//calling calculateGrades method to calculate averages for all 3 students
				student1.calculateGrades();
				student2.calculateGrades();
				student3.calculateGrades();
				
			
				//using printf to format the display of all information from student identification, calculated grade averages, and pass/fail result
				System.out.printf("\n  Student Name  |  ID  | Practical Grade | Exam Grade | Total Grade | Result%n");
				System.out.printf("----------------------------------------------------------------------------%n");
				
				
				//printing student info, calculated grade averages, and pass/fail result to screen for user
				student1.printStudentGrades();
				student2.printStudentGrades();
				student3.printStudentGrades();
				

			}//end of main method

		}//end of class
	