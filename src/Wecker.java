
public class Wecker {
	
	private int mWeckzeitStd;
	private int mWeckzeitMin;
	String mName;
	boolean active;
	
    //Constructor
	public Wecker(String Weckername) {
		mWeckzeitStd = 0;
		mWeckzeitMin = 0;
		mName = Weckername;
	}

	public void weckerStellen(int WeckzeitStd,int WeckzeitMin){
		mWeckzeitStd = WeckzeitStd;
		mWeckzeitMin = WeckzeitMin;
		//Moeglicher Event Listener 
		
		//Ausgabe gestellte Zeit
		System.out.println("Wecker wurde auf "+mWeckzeitStd+"Uhr "+mWeckzeitMin+" gestellt!");
		
	}
	public void weckerAktivieren(){
		active = true;
		//Ausgabe, dass der Wecker jetzt aktiv ist
		System.out.println("Wecker ist aktiv!");
	}
}
