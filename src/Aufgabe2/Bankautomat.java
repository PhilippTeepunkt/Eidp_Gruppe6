package Aufgabe2;

import java.util.Scanner;

public class Bankautomat {
	
	private static final String WILLKOMMENSNACHRICHT = 
			"Herzlich Willkommen!\n" +
			"-----------------------------------------\n" +
			"Was können wir für Sie tuen?\n" +
			"Drücken Sie:\n" +
			"   (1) um ihren Kontostand abzufragen, \n" +
			"   (2) um Geld einzuzahlen\n" +
			"   (3) um Geld abzuheben \n" +
			"   (4) Beenden";
	
	private static boolean runtime;
	private Person kunde;
	private static Scanner sc;
	
	public static void main(String[] args) {
		
		//initialize Person
		//create konto object
		sc = new Scanner(System.in);
		Person kunde = anmelden();
		Konto konto = new Konto(kunde);
		
		System.out.println(WILLKOMMENSNACHRICHT);
		
		runtime = true;		
		while(runtime){
			
			int eingabe = sc.nextInt();
			switch (eingabe){
				case 1:
					System.out.println(konto.kontostandAbfragen());
					System.out.println("Sonst noch etwas?");
					break;
					
				case 2:
					//einzahlen
					System.out.println("Wie viel wollen Sie einzahlen?");
					konto.einzahlen(sc.nextFloat());			
					System.out.println("Sonst noch etwas?");
					break;
					
				case 3:
					//abheben
					System.out.println("Wie viel wollen Sie abheben?");					
					konto.abheben(sc.nextFloat());
					System.out.println("Sonst noch etwas?");
					break;
					
				case 4:
					runtime = false;
					System.out.println("Auf Wiedersehen!");
					break;
					
				default:
					System.out.println("Ungueltige Eingabe!");
			}
		}
		sc.close();
	}
	
	//method to create new Person
	private static Person anmelden(){
		System.out.println("Vorname eingeben:");
		String vor = sc.next();
		System.out.println("Nachname eingeben:");
		String nach = sc.next();
		Person person = new Person(vor,nach);
		
		
		return person;
	}

}
