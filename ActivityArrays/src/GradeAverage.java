import java.util.Scanner;

public class GradeAverage {
	String gradesLetter;
	double gradesAvg, gradesPoint;
	
	Scanner allinput = new Scanner(System.in);
	public void GradeAverage() {
		double[] gradeAll;
		String allGrade = "", gradeLetter;
		double gradeAvg, gradePoint;

		System.out.println("How many grades will you enter?(min:2) ");
		int gradeAmt = allinput.nextInt();
		
		if (gradeAmt <= 1) {
			System.out.println("Try again.");
			GradeAverage();
		}
		gradeAll = new double[gradeAmt];
		
		for(int i=0;i<gradeAmt;i++) {
			System.out.println("Enter a grade: ");
			gradeAll[i] = allinput.nextDouble();
		}
		allGrade += gradeAll[0];
		gradeAvg = gradeAll[0];
		for(int i=1;i<gradeAmt;i++) {
			allGrade += ", " + gradeAll[i];
			gradeAvg += gradeAll[i];
		}
		gradeAvg /= gradeAmt;
		gradePoint = gradeAvg/100.0;
		gradePoint *= 4.0;
		if (gradeAvg >= 90) {
			gradeLetter = "A";
		}
		
		else if (gradeAvg >= 80) {
			gradeLetter = "B";
		}
		
		else if (gradeAvg >= 70) {
			gradeLetter = "C";
		}
		
		else if (gradeAvg >= 65) {
			gradeLetter = "D";
		}
		
		else {
			gradeLetter = "F";
		}
		this.gradesLetter = gradeLetter;
		this.gradesAvg = gradeAvg;
		this.gradesPoint = gradePoint;
	}
	
}
