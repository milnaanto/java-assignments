package oddoreven;

import java.util.Scanner;

public class NumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int countwords = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String  text = scan.nextLine();
		
		for(int i = 0; i <text.length(); i++)
		{
			if(text.charAt(i)==' ')
				countwords++;
		}
		countwords = countwords + 1;
		System.out.println("Total number of words : " + countwords);
	}

}
