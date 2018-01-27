package Aufgabe1;
import java.util.ArrayList;


public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<iShape> l = new ArrayList<iShape>(); //Parametrische Polymorphie
		l.add(new Triangle(1.5,2.0,1.0));
		l.add(new Circle(3.5));
		l.add(new Rectangle(7.5,3.5));
		
		for(iShape s : l){
			System.out.println(s.toString() + " area: " + s.area() + " circumference: " + s.circumference());
		}
	}

}
