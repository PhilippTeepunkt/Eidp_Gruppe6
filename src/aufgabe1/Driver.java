package aufgabe1;

public class Driver{

	public static void main(String[] args){

		Bibliothek bib = new Bibliothek();

		Buch[] hp = new Buch[7];
		hp[0] = new Buch("Harry Potter und der Stein der Weisen");
		hp[1] = new Buch("Harry Potter und die Kammer des Schreckens");
		hp[2] = new Buch("Harry Potter und der gefangene von Askaban");
		hp[3] = new Buch("Harry Potter und der Feuerkelch");
		hp[4] = new Buch("Harry Potter und der Orden des Phoenix");
		hp[5] = new Buch("Harry Potter und der Halbblutprinz");
		hp[6] = new Buch("Harry Potter und die Heiligtuemer des Todes");

		bib.setBuecher(hp);

		for(Buch b : bib.getBuecher()){
			System.out.println(b.getTitle());
		}

	}

}