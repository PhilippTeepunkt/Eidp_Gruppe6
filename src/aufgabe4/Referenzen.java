package aufgabe4;

import java.util.Arrays;

public class Referenzen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		wrongReferences();
		correctReferences();

	}
	
	private static void wrongReferences(){
		
		double[]primeNumbers = {3, 5, 7, 11, 13, 17};
		double[]sqrtOfPrimeNumbers = primeNumbers;
		/*es wird ein neues array deklariert mit der Referenz auf das Array primeNumbers
		 *die Variable sqrtOfPrimeNumbers, zeigt also im Stack auf die gleiche Instanz wie primeNumbers*/
		
				
		for(int i=0; i<6;i++)
		{
			/*mit dieser Zuweisung, wird die Instanz auf das squrtOfPrimeNumbers zeigt aufgerufen, 
			 *der jeweilige Wert verarbeitet und ueberschrieben */
			sqrtOfPrimeNumbers[i] = Math.sqrt(sqrtOfPrimeNumbers[i]);
		}
		
		System.out.println("sqrtOfPrimeNumbers: "+Arrays.toString(sqrtOfPrimeNumbers));
		
		double[]squaredPrimeNumbers = primeNumbers;
		for(int i = 0; i<6; i++)
		{
			/*erneut wird ein Array deklariert, mit der referenz auf die Instanz von primeNumbers auf dem Stack 
			 *Dadurch, dass das die Werte der Instanz von primeNumbers ueberschrieben wurden sind in primeNumbers
			 *nicht mehr unsere urspruenglichen Primzahlen enthalten
			 *Das endergebnis durch erneutes aufrufen und ueberschreiben sind unsere ursprungsprimzahlen 
			 *(quadrieren von Werten von denen die Wurzel gezogen wurde)*/
			squaredPrimeNumbers[i] = squaredPrimeNumbers[i]*squaredPrimeNumbers[i];
		}
		
		System.out.println("squaredPrimeNumbers: "+Arrays.toString(squaredPrimeNumbers));
		System.out.println("primeNumbers: "+Arrays.toString(primeNumbers));
		System.out.println("---------------------------------------------------------------------------------");
	}
	
	private static void correctReferences(){
		
		double[]primeNumbers = {3, 5, 7, 11, 13, 17};
		double[]sqrtOfPrimeNumbers = new double[6];
				
		for(int i=0; i<6;i++)
		{
			sqrtOfPrimeNumbers[i] = Math.sqrt(primeNumbers[i]);
		}
		
		double[]squaredPrimeNumbers = new double[6];
		for(int i = 0; i<6; i++)
		{
			squaredPrimeNumbers[i] = primeNumbers[i]*primeNumbers[i];
		}
		
		System.out.println("primeNumbers: "+Arrays.toString(primeNumbers));
		System.out.println("sqrtOfPrimeNumbers: "+Arrays.toString(sqrtOfPrimeNumbers));
		System.out.println("squaredPrimeNumbers: "+Arrays.toString(squaredPrimeNumbers));
		
	}

}
