package aufgabe4;

public class CementStorage {

	private static final int maxAmount = 1000;
	private int freeAmount;
	private static final int maxWeight = 40000;
	private int freeWeight;
	private static int[]cement;
	
	public CementStorage() {
		//init
		cement = new int[999];
		freeAmount = maxAmount;
		freeWeight = maxWeight;
	}
	
	public int getFreeAmount(){
		return freeAmount;
	}
	
	public int getFreeWeight(){
		return freeWeight;
	}
	
	public boolean stockCement(int[]bags){
		
		//check if there is enough space 
		if(getFreeAmount()-bags.length>0){
			
			//check if the bags aren't to heavy
			if(freeWeight-getWeight(bags)>0){
				freeAmount = getFreeAmount() - bags.length;
				freeWeight = getFreeWeight() - getWeight(bags);
				
				//for-loop to stock the bags
				for (int i = 0;i<cement.length;i++){
					if (cement[i]==0){
						for (int j =0; j<bags.length;j++){
							if(bags[0]==0){break;}
							else {
								cement[i]=bags[j];
							}
						}
					}
				}
				return true;
			}
			return false;
		}
		return false;
	}
	
	//helper method for returning the weight of an amount of 
	private static int getWeight(int[]array){
		
		int tempWeight = 0;
		
		for(int i =0; i<array.length;i++){
			if(array[i]==0){break;}
			tempWeight = tempWeight + array[i];
		}
		
		return tempWeight;
	}
}
