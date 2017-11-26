package Aufgabe_2_3;

import java.util.Scanner;

public class SchiffeVersenken {

	private static boolean[][] playarea;
	private static Scanner sc;
	private static int gameOver;
	
	public static void main(String[] args) {
		
		initPlayArea();
		play();			
	}
	
	public static void initPlayArea()
	{
		
		//init playarea
		playarea = new boolean[10][10];
		
		//set all elements to false
		for (int x = 0; x<10; x++){			
			for (int y = 0; y<10; y++)
			{
				playarea[x][y]=false;
			}				
		}
		
		//create some test-ships		
		playarea[2][2] = true; //corresponds Coordinates x=3 y=3
		playarea[2][3] = true;
		playarea[5][4] = true;
		playarea[4][4] = true;
		playarea[8][9] = true;
		playarea[7][9] = true;
		playarea[9][1] = true;
		
		//set number of ships as for counting remaining ships
		gameOver = 7;
	}
	
	public static void play(){
		
		System.out.println("Try to hit me: ");
		
		sc = new Scanner(System.in);
		while (gameOver > 0){
			
			int inX =0;
			int inY =0;
			
			//input
			System.out.println("x coordinate");
			inX = sc.nextInt();
			
			//checks if input is invalid
			if(inX>10) {
				System.out.println("Your x Coordinate is not in the PlayArea!");
				continue;
			}
		
			System.out.println("y coordinate");
			inY = sc.nextInt();
			//**
			if(inY>10){
				System.out.println("Your y Coordinate is not in the PlayArea!");
				continue;
			}
		
			//logic
			if (hit(inX-1,inY-1)){
				System.out.println("Eyyyy, you hit me!");
				playarea[inX-1][inY-1] = false;		
				
				//counter for remaining ships
				gameOver -= 1;
			}
			else {
				System.out.println("You missed!");
				}
			System.out.println("-----------------------------------------------------------");
			System.out.println("Try again!");
			System.out.println("");
		}
		
		System.out.println("GAME OVER");
		sc.close();
		
	}
	
	//check for hit
	public static boolean hit(int X,int Y){		
				
		return playarea[X][Y];
	}
}
