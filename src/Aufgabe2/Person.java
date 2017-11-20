package Aufgabe2;

public class Person {
	
	private String Vorname, Nachname;

	public Person(String vorname,String nachname) {
		
		Vorname = vorname;
		Nachname = nachname;
	}
	
	public String getName()
	{
		return Vorname+" "+Nachname;
	}
}
