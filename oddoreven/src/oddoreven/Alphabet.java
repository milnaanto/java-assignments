package oddoreven;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" Enter a letter: ");
		Scanner scan = new Scanner(System.in);
		char letter = scan.next().charAt(0);
		
		if(letter =='a'|| letter =='e'|| letter =='i'|| letter =='o'|| letter =='u'|| letter =='A'||letter =='E'|| letter =='I'|| letter =='O'|| letter =='U') 
		{
			System.out.println("It's a vowel");
			
		} else if((letter>= 65 && letter <= 90) || (letter>= 97 && letter <= 122))
		{
			System.out.println("It's a consonant");
			
		} else {
			
		System.out.println("Not an alphabet");
			
		}
		
		
		
		

	}

	private static void elseif(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
