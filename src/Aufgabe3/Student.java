package Aufgabe3;

public class Student {

	private String studiengang;
	private Name name;
	private static final int matNr = 11833;
	private Adresse adresse;
	
	public Student(Name N, String sg, Adresse adr) {
		
		name = N;
		studiengang = sg; 
		adresse = adr;
	}
}
