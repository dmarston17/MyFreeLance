import java.util.Scanner;

import java.util.DoubleSummaryStatistics;



public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int studentsAge = 15;
		double studentGPA = 3.45;
		String studentFirstInitial = "D";
		String studentFirstName = "Demor";
		String studentLastName = "Marston";
		String studentLastInitial = "M";
		boolean hasPerfectScore = true;
		char studentFirstInitial1 = studentFirstName.charAt(0);
		char studentLastInitial1 = studentLastName.charAt(0);
		

		
		System.out.println ("Student's GPA = " + studentGPA);
		System.out.println (hasPerfectScore);
		System.out.println (studentFirstInitial1);
		System.out.println (studentLastInitial1);
		System.out.println (studentFirstName);
		System.out.println (studentLastName);
		System.out.println (studentFirstName + " " +  studentLastName );
		
		System.out.println (studentFirstName + " " + studentLastName + " has a GPA of" + " " +  studentGPA );
		System.out.println ("What do you want to update ? ");
		
		
		Scanner input = new Scanner(System.in);
		studentGPA = input.nextDouble();
		
		
		System.out.println (studentFirstName + " " + studentLastName + " " + "now has a GPA of" + " " +  studentGPA );
	}
	
	//look into creating a sneaker bot
}
	
//	void moving () {
//		
//	}
//
//}


