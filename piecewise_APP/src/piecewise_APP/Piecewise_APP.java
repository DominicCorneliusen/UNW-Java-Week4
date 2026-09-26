package piecewise_APP;

import java.util.Scanner;

public class Piecewise_APP {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		//define my variables
		int function;
		int x;
		//tell the user what the functions are.
		System.out.println("The piecewise function is: \nf(x) = {x < 0:3x + 7,\n0 <= x <= 10:x^2 + 8,\nx > 10:x^3 - 6x^2");
		
		//request for valid integer
		System.out.println("Enter a valid integer.");
		
		//assign valid integer to x.
		x = userinput.nextInt();
		
		//which function to use?
		if (x < 0) { //only if x < 0
			function = (3 * x) + 7;
			System.out.println("f(x) = " + function);
			
		} else if (0 <= x && x <= 10) { //if x is both >= 0 and <= 10
			function = (int) (Math.pow(x, 2) + 8);
			System.out.println("f(x) = " + function);
			
		} else if (x > 10) { //if x > 10
			function = (int) ((Math.pow(x, 3)) - (6 * (Math.pow(x, 2))));
			System.out.println("f(x) = " + function);
			
		} else { //if there is something else that went wrong. I need exception statements.
			System.out.println("The input you gave is invalid. Please try again.");
		}
	}
}
