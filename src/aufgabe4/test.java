package aufgabe4;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]bags = new int[20];
		bags[0] = 10000;
		bags[1]= 20000;
		bags[2]= 20;
		CementStorage cs = new CementStorage();
		System.out.println(cs.getFreeAmount());
		System.out.println(cs.getFreeWeight());
		System.out.println(cs.stockCement(bags));
		System.out.println(cs.getFreeAmount());
		System.out.println(cs.getFreeWeight());
		
		
	}

}
