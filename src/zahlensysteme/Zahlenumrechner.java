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
			
			
		//calculation
			while(n>m){
				R = n%m;
				if (R==0){
					n = n/m;
					output = R+output;}
				
				else if (R>9){
					Z=R-9;
					output = alphabet[Z-1]+output;
				}
				else {output = R+output;}
			}
			
			R = n%m;
			if (R>9){ Z=R-9; output = alphabet[Z-1]+output;}
			else {output = R+output;}
			return (output);
	}
}
