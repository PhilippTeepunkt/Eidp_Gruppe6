import java.util.Scanner;

public class ComplexTest {

	private static Scanner sc;
	private static String Ergebnis;
	private static final String ADD = "add";
	private static final String MULT = "mult";
	
	public static void main(String[] args) {
		
		//input
		sc = new Scanner(System.in);
		
			//request operation
		System.out.println(MULT+" oder "+ADD+" fuer Rechenoperation eingeben: ");
		String rechenoperation = sc.next();
		
			//request parameters
		System.out.println("Parameter eingeben: ");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		
			//instantiate object from class complex to create complex number  
		Complex c1 = new Complex(a,b);
		System.out.println(c1.toString());
		
		System.out.println(rechenoperation);
	
		float c = sc.nextFloat();
		float d = sc.nextFloat();
		Complex c2 = new Complex(c,d);
		System.out.print(c2.toString());
		
		System.out.println("");
		sc.close();
		
		
		//calculation
		if (rechenoperation.equals(ADD)){
			//call static method to calculate the two complex objects
			Ergebnis = Complex.add(c1, c2).toString();
		}
		
		else if (rechenoperation.equals(MULT)){
			//**
			Ergebnis = Complex.mult(c1, c2).toString();
		}
		else
		{
			System.out.println("Keine gueltige Rechenoperation (add,mult)!");
		}
		
		//output
		if (Ergebnis!=null){
			System.out.println("Ergebnis: "+Ergebnis);
		}
		
		//comparison test
		Complex compTest1 = new Complex(1,2);
		if(compTest1.equals(new Complex(1,2)))
		{
			System.out.println("(1,2)==(1,2) Test successfull");
		}
		else
			System.out.println("Error");
			
		Complex compTest2 = new Complex(1,2);
		if(compTest2.equals(new Complex(3,4)))
		{
			System.out.println("Error");
		}
		else {
			System.out.println("(1,2)!=(3,4) Test successfull");
		}
		

		//error
		Complex z1 = new Complex(1,2);
		Complex z2 = z1;
		Complex z3 = new Complex(1,2);
		System.out.println("z1==z2 -> "+(z1==z2));
		System.out.println("z1==z3 -> "+(z1==z3));
	}

}
