package Aufgabe1;
import java.awt.Color;


public class Rectangle implements iShape{ //Inklusions-Polymorphie
	
	private double height;
	private double width;
	private Color color;
	
	public Rectangle(double height, double width){
		this.height = height;
		this.width = width;
	}
	
	public double getHeight(){
		return height;
	}
	
	public double getWidth(){
		return width;
	}
	//Inkl. 
	public double area(){
		return width*height;
	}
	//Inkl.
	public double circumference(){
		return 2*height+2*width;
	}
	
	//Ad-Hoc polymorphie
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
		return "This is a rectangle";
	}

}
