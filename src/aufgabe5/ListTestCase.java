package aufgabe5;

public class ListTestCase {
	
	private static List list;
	private static Cell[] cells;

	public static void main(String[]args){
		
		initList();
		list.removeYAfterX(1, 9);
		
	}
	
	public static void initList(){
		
		list = new List();
		cells = new Cell[11];
		int[] CellContent = {1,9,9,2,1,9,1,4,9,5};
		
		for(int i=1; i<11; i++){
			cells[i] = new Cell();
			if(cells[i-1]!=null)
				{
					cells[i].prev = cells[i-1];
					cells[i-1].next = cells[i];
				}
			cells[i].content = CellContent[i-1];
		}
		list.setFront(cells[1]);
	}
}
