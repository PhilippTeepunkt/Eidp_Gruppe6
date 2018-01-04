package aufgabe1;

import java.util.Random;
import java.util.GregorianCalendar;

public class Adventskalender {

	private Sweetie[]sweetie;
	private GregorianCalendar calendar;
	private int numberOfUnopenedDoors; //variable to count unopened doors
	private Thread t;
	
	//constructor
	public Adventskalender(){
		
		//init
		calendar = new GregorianCalendar();
		Random rnd = new Random();
		sweetie = new Sweetie[24];
				
		//fill the Array
		for (int i=0;i<24;i++){
			sweetie[i] = Sweetie.values()[rnd.nextInt(6)];
		}
		numberOfUnopenedDoors = 24;
		
	}
	
	//method to open a door and return the content
	public void openDoor(int day){
		
		//check if the door was already opened
		if(sweetie[day-1]==null){
			System.out.println("Door already opened!");}
		
		//check the permission to open a specific door
		else if (day <= calendar.get(java.util.Calendar.DAY_OF_MONTH)){
		
			numberOfUnopenedDoors--;
			if(sweetie[day-1].equals(Sweetie.SchokoNikolaus)){
				
				MyAudio.play("jingle-bells.wav");
			}	
			System.out.println(sweetie[day-1].toString());
			sweetie[day-1] = null;
		}
		
		else {
			
			System.out.println("It's not the time to open it!");
		}
	}
	
	//getter method to return the number of unopened doors	
	public int getNumberOfUnopenedDoors(){
		
		return numberOfUnopenedDoors;
	
	}
}
