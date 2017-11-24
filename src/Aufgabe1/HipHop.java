package Aufgabe1;

public class HipHop {

	public static void main(String[] args) {
		
		int i = 1;
		
		while(i<=100)
		{
			//a)
			if (i%7==0){
				System.out.println("Hop");
			}
			//b)
			if ((i-7) % 10 == 0){
				System.out.println("Hip");
			}
			//not a) and not b)
			else {System.out.println(i);}
			
			i++;
		}
		
	}

}
