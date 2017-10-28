public class Hund {
	
	private String mName;
	
	public Hund(String name){
		mName = name;
	}
	
	public String namensschildLesen(){
		
		System.out.println("Der Hund heißt "+mName);
		bellen();
		return mName;
	}
	
	private void bellen(){
		System.out.println("Wuff Wuff");
	}
}
