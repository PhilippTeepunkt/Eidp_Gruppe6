package Aufgabe2;

import java.text.*;

public class Konto {
	
	private final Person inhaber;
	private DecimalFormat f;
	private float kontostand;
	
	public Konto(Person mInhaber) {
		
		f = new DecimalFormat("#0.00"); //limit decimal
		
		//init
		inhaber = mInhaber;
		kontostand = 0f;
		}
	
	//method einzahlen
	public void einzahlen(float betrag){
		
		kontostand = kontostand + betrag;
		System.out.println(f.format(betrag)+"€ wurden eingezahlt.");
		System.out.println("----------------------------------------");
		System.out.println("Ihr Kontostand beträgt: "+f.format(kontostand)+"€");
	}
	
	//method abheben
	public void abheben(float betrag){
		
		//verhindern von einem negativen kontostand 
		if(kontostand>betrag){
			kontostand = kontostand - betrag;
			System.out.println(f.format(betrag)+"€ wurden abgehoben.");
			System.out.println("----------------------------------------");
			System.out.println("Ihr Kontostand beträgt: "+f.format(kontostand)+"€");
			
		}
		else {
			System.out.println(f.format(kontostand)+"€ konnten abgehoben werden." );
			kontostand = 0f;
			System.out.println("----------------------------------------");
			System.out.println("Ihr Kontostand beträgt: 0€");
		}
	}
	
	//getter method
	public String kontostandAbfragen(){
		
		return f.format(kontostand);
	}
	

}
