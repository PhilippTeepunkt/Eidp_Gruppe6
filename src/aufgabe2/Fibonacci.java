package aufgabe2;

import java.util.Scanner;

public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		System.out.println(fibonacci(input));
		sc.close();

	}
	
	//fibonacci method
	public static int fibonacci(int index){
		
		int a = index-1;
		int b = index-2;
		if (index==1){
			return 1;
		}
		if(index>0)
		{
			return fibonacci(b)+fibonacci(a);	
		}
		return 0;
	}

}
