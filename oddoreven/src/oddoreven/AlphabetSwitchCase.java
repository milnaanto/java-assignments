package oddoreven;

import java.util.Scanner;

public class AlphabetSwitchCase {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.out.println("Enter a letter:");
		Scanner scan = new Scanner(System.in);
		char letter = scan.next().charAt(0);
		boolean  isvowel = false;
		switch(letter) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u': isvowel = true;
		}
		
		if(isvowel==true) {
			System.out.println("It's a vowel");

			
		} else if 
			((letter>= 65 && letter <= 90) || (letter>= 97 && letter <= 122))
			
		{
				System.out.println("It's a consonant");
				
		} else {
			System.out.println("Not an alphabet");
			
		}

	}


}


