package randomNumber;

import java.util.Scanner;

public class randomNumber {

	
	
	public static void main(String[]args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a minimum value: ");
		int min = reader.nextInt(); 
		
		System.out.println("Enter a maximum value: ");
		
		int max = reader.nextInt(); 
		
		int random = (int)Math.random()*max+min; 
		
		System.out.println(random); 
		
	}
}

