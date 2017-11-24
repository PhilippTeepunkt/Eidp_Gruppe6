package Aufgabe_2_3;

import java.util.Scanner;

public class SchiffeVersenken {

	private static boolean[][] playarea;
	private static Scanner sc;
	private static int gameOver;
	
	public static void main(String[] args) {
		
		initPlayArea();
		System.out.println("Try to hit me: ");
		
		sc = new Scanner(System.in);
		
		while (gameOver > 0){
			
			System.out.println("x coordinate");
			int inX = sc.nextInt();
		
			System.out.println("y coordinate");
			int inY = sc.nextInt();
		
			if (hit(inX,inY)){
				System.out.println("Eyyyy, you hit me!");
				
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
		
		playarea[2][2] = true;
		playarea[2][3] = true;
		playarea[5][4] = true;
		playarea[4][4] = true;
		playarea[8][9] = true;
		playarea[7][9] = true;
		playarea[9][1] = true;
		
		gameOver = 7;

	}
	
	public static boolean hit(int X,int Y){		
		
		return playarea[X][Y];
	}
	
	
	

}
