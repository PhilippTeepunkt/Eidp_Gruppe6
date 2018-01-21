package aufgabe6;

public class Musician {
	
	private String mName;
	private Instrument mInstrument;
	private ExperienceState erfahrungsgrad;
	
	public Musician(String name, Instrument instr) {
		mInstrument = instr;
		mName = name;
	}
	
	public Instrument getInstrument(){
		
		return mInstrument;
		
	}
	
	public void setErfahrungsgrad(int jahre){
		
		//decide if the musician is advanced or beginner
		if(ExperienceState.Fortgeschritten.getErfahrungsgrenze()>jahre){
			erfahrungsgrad = ExperienceState.Anfaenger;
		}
		else erfahrungsgrad = ExperienceState.Fortgeschritten;
	}
	
	//output
	public String toString(){
		return mName+" "+mInstrument+" "+erfahrungsgrad;
	}

}
