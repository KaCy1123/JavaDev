
public class MainMenu {
	public static void main(String args[]) {
		mainmenu();
		
	}
	static void mainmenu(){
		GradeAverage gavg = new GradeAverage();
		System.out.println("Your average is " + gavg.gradesAvg);
		System.out.println("Your letter grade is " + gavg.gradesLetter);
		System.out.println("Your GPA is " + gavg.gradesPoint);
	}
}
