
public class EidpUebungsblatt {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Aufgabe 1: ");
		//Aufgabe 1 
		//Zusammenfassung der Klassen mit Methoden
		Auto auto = new Auto();
		auto.fahren(25);
		auto.tanken("SuperPlus");
		
		Hund hund = new Hund("Bello");
		hund.namensschildLesen();
		
		Wecker wecker = new Wecker("Arbeit");
		wecker.weckerStellen(13, 30);
		wecker.weckerAktivieren();
		System.out.println("........................................");
		
		operators();
	}
	//Aufgabe 2 
	public static void operators(){
		int a = 3;
		int b = 5;
		
		float c = 5/3f;
		//c = 1,66 Die Operation / Teilt b durch a und speichert das Ergebnis in der
		//Variable c mit dem Datentyp float
		
		boolean d = a!=b;
		//d = true Die Operation != ist ein Vergleichsoperator und gibt den wert true aus,
		//wenn a ungleich b ist. Der Wert wird in d vom Typ Boolean gespeichert.
		
		int e = a%b;
		//e = 3mod5 = 3 Die Operation % entspicht der modulo-Rechnung und gibt den Rest bei 
		//einer Division aus. '''''''
		
		boolean f = a==b || b>a;
		//f = true Der Vergleichs-Operator == prueft ob a = b und der Operator > prueft ob b groesser
		//als a ist. Beide Operationen sind mit einer Oder Verknuepfung || verknuepft. Liefert einer oder
		//beide Einzelvergleiche true, wird f der Wert true zugewiesen. Ansonsten ist f false.  
		
		a +=2;
		boolean g = a!=b;
		//g = false Da vorher a um 2 erhaeht wird, besitzen a und b den gleichen Wert.
		
		System.out.println("Aufgabe 2: "+"c ="+c+"; d= "+d+"; e= "+e+"; f= "+f+"; g= "+g);
		System.out.println("..........................................");
	}

}