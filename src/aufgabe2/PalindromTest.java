package aufgabe2;

import java.util.Scanner;

public class PalindromTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//input
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in word:");
		String input = sc.next();
		System.out.println(isPalindromeRec(input.toLowerCase()));
		sc.close();
		

	}
	
	//Recursive method
	public static boolean isPalindromeRec(String s){
		char a;
		char b;
		if(s.length()<2){return true;}
		
		a = s.charAt(0);
		b = s.charAt(s.length()-1);
		if (a != b){
			return false;
		}
		else
		{
			//creates new string without the first and last character
			String rest = s.substring(1, s.length()-1);
			
			//starts self
			return isPalindromeRec(rest);
		}
	}
}
