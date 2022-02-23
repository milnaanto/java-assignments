package oddoreven;

public class FactorialWhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		int factorial = 1;
		int i = 1;
		while(i<=5) {
			factorial = factorial*i;
			i++ ;
		}
System.out.println("Factorial of 5 is " + factorial);
	}

}
