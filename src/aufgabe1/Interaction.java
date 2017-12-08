package aufgabe1;

import java.util.Scanner;

public class Interaction {

	private static Adventskalender advKal;
	private static Boolean exit;
	private static Scanner sc;
	
	public static void main(String[] args) {
		
		//init
		advKal = new Adventskalender();
		sc = new Scanner(System.in);
		exit = false;
		
		//handle multiple Actions
		while(!exit){
			
			//interact with the "Adventskalender"
			interact();
			
			//ask if the user wants to open another door
			System.out.println("Do you want to open another door?");
			System.out.println("Type [yes] or [no]");
			String answer = sc.next();
			if(answer.equals("no")|advKal.getNumberOfUnopenedDoors()==0){
				exit = true;
			}
			if(!answer.equals("no")&&!answer.equals("yes")){System.out.println("Your input isn't valid!");}
			
		}
		
		sc.close();
	}
		
	
	//interact method
	private static void interact(){
		
		//get input, which door the user wants to open
		System.out.println("Which door do you want to open?");
		int doorIndex = sc.nextInt();
		advKal.openDoor(doorIndex);
		
	}

}
