//Title: Tutorial #1.1.2 - Input With Variables
//Author: Jianzhuo Ye
//Start Date: 9/10/2024
//End Date: 9/10/2024
//Description: Simple, introductory program to JAVA
package introPack;

import java.text.DecimalFormat;
import java.util.Scanner;

public class InputVariables {
	
	//Declares all libraries for input and output events
	static Scanner allinput = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("###");
	
	//
	int whichtemp;
	char Celtemp = 'C', Fahrentemp = 'F';
	String firstname, lastname, fullname;
	static double Celvalue, Fahrenvalue, celtofahren = 1.8, fahtocel = 0.56;
	
	public static void main(String[] args)
	{
		System.out.println("Temperature Conversion");
		System.out.print("Enter a temperature in Celsius: ");
		Celvalue = allinput.nextDouble();
		Fahrenvalue = (Celvalue * celtofahren) + 32;
		System.out.println("The Fahrenheit temperature is " + Fahrenvalue + " degrees");
		
		System.out.print("Enter a temperature in Fahrenheit: ");
		Fahrenvalue = allinput.nextDouble();
		Celvalue = (Fahrenvalue - 32) * fahtocel;
		System.out.println("The Celsius temperature is " + df.format(Celvalue) + " degrees");
		
	}
}
