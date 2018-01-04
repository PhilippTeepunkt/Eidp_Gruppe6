package aufgabe5;

public class List {

	private Cell front; //null is empty
	
	public List() {
		// TODO Auto-generated constructor stub
	}

	public void removeYAfterX(int x, int y){
		//normalerweise Implementierung ueber rekursiven Durchlauf der Listenelemente und Kompositum
		//dazu muesste man allerdings eine Methode in Cell.java implementieren
		
		//umstaendlichere Loesung:
		Cell tempFront;
		tempFront=front;
		
		try{
			//Bedingung, dass es einen Nachfolger gibt
			while(front.next!=null){
				//Bedingung, das wir die Zahlenfolge x,y haben
				if(front.content==x&&front.next.content==y){
				
					System.out.println("Cell with content: "+front.next.content+" deleted!");
					front.next =front.next.next;
					front.next.prev = front;
				}
				System.out.println("Cell: "+front.content);
				front = front.next;
			}
			System.out.println("Cell: "+front.content);
			front=tempFront;
			
		}catch(NullPointerException e){
			System.out.println("Letztes Element wurde geloescht!");
		}
	}
	
	//optional fuer ListTestCase
	public void setFront(Cell f){
		
		front = f;
	}
}
