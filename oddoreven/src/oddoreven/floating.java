package oddoreven;

import java.util.Scanner;

public class floating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("First floating number");
double A = input.nextDouble();
System.out.println("Second floating number");
double B = input.nextDouble();

if ( Math.abs(A - B) <= 0.01 ) {
	System.out.println("Given numbers are equal");
} else {
	System.out.println("Given numbers are  not equal");
}
	}

}
