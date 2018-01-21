package aufgabe6;

public class EventTestCase {

	/**
	 * @param args
	 */
	
	private static Orchestra orchestra;
	private static String[] names = {"Peter", "Horst", "Dieter", "Jochen", "Hans", "Rudolf", "Susi", "Petra", "Marie"};
	
	public static void main(String[] args) {
		
		//init new orchestra
		orchestra = new Orchestra("BisschenZuVielVormRechner", 2018);
		
		//init and fill Musician array with one Musician per Instrument
		Musician[] mus = new Musician[Instrument.values().length];
		for(int i=0; i<Instrument.values().length;i++){
	    	mus[i] = new Musician(names[i],Instrument.values()[i]);
	    }
		
		//set Musicians for the Orchestra
		orchestra.setMusicians(mus);
		System.out.println(orchestra.toString());
		
		System.out.println("-----------------------------------------");
		System.out.println("Composition:  ");
		
		//array of instruments for the Composition
		Instrument[] inst = {Instrument.Violine,Instrument.Oboe,Instrument.Triangel};
		
		//output
		Musician[] output = orchestra.selectMusiciansForComposition(inst);
		for(Musician m : output){
			if(m!=null){System.out.println(m.toString());}
		}

	}

}
