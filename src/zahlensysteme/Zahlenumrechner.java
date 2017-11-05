package zahlensysteme;

import java.util.Scanner;

public class Zahlenumrechner {

	private static char[]alphabet;
	
	public static void main(String[] args) {
		
	    int N;
		int M;
		
		//Get Input
				Scanner scanner;
				scanner = new Scanner(System.in);
				System.out.println("Ganze Zahl eingeben:");
				N = scanner.nextInt();
				System.out.println("Basis eingeben:");
				M = scanner.nextInt();
				scanner.close();
				
		//fill up Array
				alphabet = new char[26];
				int i = 0;
				for (char c = 'A';i<alphabet.length;c++,i++)
				{
					alphabet[i]=c;					
				}
				
		//Output 
				System.out.println("Die umgerechnete Zahl zur basis "+M+" ist: "+ umrechnen(N,M));
	}
	
	private static String umrechnen(int n,int m){
		
		//temporary variables
			int Z;
			int R;
			String output = "";
			char buchstabe;
			
		//calculation
			
			while(n>0)
			{
				R = n%m;
				if(R>9)
				{
					buchstabe = alphabet[R-10];
					output = buchstabe+output;
				}
				else {
					output = R+output;
				}
				
				Z = n-R;
			    n= Z/m;
				
			}
			
			return output;

	}
}