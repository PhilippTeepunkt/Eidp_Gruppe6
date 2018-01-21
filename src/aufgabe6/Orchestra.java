package aufgabe6;

public class Orchestra {
	
	Musician[]musicians;
	int Gruendungsjahr;
	String Name;
	Conductor dirigent;	

	public Orchestra(String mName, int mGruendungsjahr) {
		
		Gruendungsjahr = mGruendungsjahr;
		Name = mName;
	}
	
	public void setMusicians(Musician[]mus){
		
		musicians = new Musician[mus.length];
		for(int i=0; i<mus.length;i++){
			musicians[i]=mus[i];
		}
	}
	
	public Musician[] selectMusiciansForComposition(Instrument[] instrumentsNeeded){
		
		Musician[]temp = new Musician[musicians.length];
		
		int h = 0; //laufvariable zur Ordnung
		for (Instrument i : instrumentsNeeded){
			for(Musician m : musicians){
				if(m.getInstrument()==i){
					temp[h]=m;
					h++;
				}
			}
		}
		return temp;
	}
	
	//creates outputstring
	public String toString(){
		
		StringBuilder sb = new StringBuilder();
		sb.append("Name:  "+Name);
		sb.append(System.getProperty("line.separator"));
		sb.append("Gegruended: "+Gruendungsjahr);
		sb.append(System.getProperty("line.separator"));
		for(int i=0; i<musicians.length;i++){
			sb.append(musicians[i].toString());
			sb.append(System.getProperty("line.separator"));
		}
		return sb.toString();
	}
	
	
}
