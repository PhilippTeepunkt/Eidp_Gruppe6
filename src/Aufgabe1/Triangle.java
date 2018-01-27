package Aufgabe1;
 import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Triangle implements iShape{  //Inklusions-Polymorphie
	
	private double a;
	private double b;
	private double c;
	private Color color;
	
	public Triangle(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getA(){
		return a;
	}
	
	public double getB(){
		return b;
	}
	
	public double getC(){
		return c;
	}
	//inkl.
	public double area(){
		double s = (a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-b));
	}
	
	//inkl.
	public double circumference(){
		return a+b+c;
	}

	public Color getColor() {
		return color;
	}

	//Ad-Hoc Polymorphie
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
		return "This is a triangle";
	}
	
}
