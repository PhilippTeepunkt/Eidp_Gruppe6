package Aufgabe1;
import java.awt.Color;


public class Circle implements iShape{ //Bedingung Inklusions-Polymorphie
	
	private double radius;
	private Color color;
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public double getRadius(){
		return radius;
	}
	
	//Inkl. / Overriding
	public double area(){
		return radius*Math.PI;
	}
	//Inkl.
	public double circumference(){
		return 2*Math.PI*radius;
	}
	
	//Ad-Hoc Polymorphie / Overloading
	public void setColor(Color color) {
		this.color = color;
	}
	// ''
	public void setColor(int r, int g, int b){
		color = new Color(r, g, b);
	}
	// ''
	public void setColor(int rgb){
		color = new Color(rgb);
	}
	
	public String toString(){
		return "This is a circle";
	}

}
