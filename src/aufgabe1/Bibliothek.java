package aufgabe1;

public class Bibliothek {
	
	private Buch[]buecher;

	public Bibliothek() {}
	
	public void setBuecher(Buch[]b){
		buecher = b;
	}
	
	public Buch[] getBuecher(){
		return buecher;
	}

}
