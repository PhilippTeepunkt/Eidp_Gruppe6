package aufgabe6;

public enum ExperienceState {
	
	Anfaenger(3),Fortgeschritten(4);
	
	private final int erfahrungsGrenze;
	
	private ExperienceState(int mJahre){
		
		erfahrungsGrenze = mJahre;
	}
	
	public int getErfahrungsgrenze(){
		
		return erfahrungsGrenze;
	}
}
