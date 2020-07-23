import java.util.Scanner;

public class palindrome {


	public static void main (String[]args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a word");
		
		String word = reader.next();
		
		String reversed = "";
		
		for(int i = word.length()-1; i>=0; i--) {
			
			reversed+=word.charAt(i);
			
			
		}

		
		if (reversed.equals(word)) {
			
			System.out.println("True");
		}else {
			System.out.println("false"); 
		}
		
		
		
	}
}

