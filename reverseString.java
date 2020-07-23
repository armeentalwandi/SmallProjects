package reverseString;


import java.util.Scanner;


public class reverseString {

	public static void main(String[]args) {
	
	String reversed = "";
	Scanner reader = new Scanner(System.in);
	
	System.out.println("Enter a word:");
	String word = reader.next(); 
	
	for(int i = word.length()-1; i>=0; i--) {
		
		reversed+= word.charAt(i);
		
	}
	System.out.println(reversed);


}
}

