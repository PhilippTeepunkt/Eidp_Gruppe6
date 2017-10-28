
public class Auto {
	
	private int mKilometerstand;
	private int mBenzin;
	
	public Auto(){
		tanken("SuperPlus");
		mKilometerstand =0;
	}
	
	public void tanken(String benzinart)
	{
		if(benzinart=="SuperPlus"){
			mBenzin = 100;
			System.out.println("Auto aufgetankt");
		}
		else {
			
			mBenzin = 0;
			System.out.println("Gluk Gluk puff bumm!");
		}
	}
	
	public void fahren(int mKMeter){

		if(mBenzin!=0&&mKilometerstand<300000){
			mKilometerstand+=mKMeter;
			mBenzin = mBenzin - 4*mKMeter;
			System.out.println("Kilometerstand= "+mKilometerstand);
		}
		else if(mBenzin==0){
			System.out.println("Tank ist leer");
		}
		
		else {
			System.out.println("Ratter Ratter Ratter");
		}
	}
}
