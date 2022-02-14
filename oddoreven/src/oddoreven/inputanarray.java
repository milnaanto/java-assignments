package oddoreven;

import java.util.Scanner;

public class inputanarray {

	public static void main(String[] args) {
	
		
		// TODO Auto-generated method stub
		Scanner objec = new  Scanner (System.in);
		System.out.println("Enter the number of elements in the array");
		
		int number = objec.nextInt();
		int array[] = new int[number];
		System.out.println("Enter the elements in the array");
		for(int i = 0; i < number; i++)
		{
			array[i] = objec.nextInt();
			
		}
			
		int max = array[0];
		int min = array[0];
		for(int i = 0; i < number; i++ )
		{
			if(max < array[i])
			{
				max = array[i];
			}
			if(min > array[i])
			{
				min = array[i];
			}
		}
		
System.out.println("Largest number in the array is " + max);
System.out.println("Smallest number in the array is " + min);
	}

}
