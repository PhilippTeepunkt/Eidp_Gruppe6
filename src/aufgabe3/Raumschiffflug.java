package aufgabe3;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Raumschiffflug {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		System.out.println("Which spaceship is used?");
		System.out.println(
				"Type in: \n" +
				"(1) for Orion \n" +
				"(2) for Galactica \n" +
				"(3) for Excelsior \n");		
		int raumschiff = sc.nextInt();
		
		System.out.println("Which destination?");
		System.out.println(
				"Type in: \n" +
				"(1) for Mond \n" +
				"(2) for Mars \n" +
				"(3) for Pluto \n");
		int ziel = sc.nextInt();
		
		weltraumflug(raumschiff,ziel);
		sc.close();
	}
	
	public static void weltraumflug(int raumschiffindex,int zielindex){
		
		// travel distance in kilometers
		int distance;
		// acceleration in m/s^2
		float acceleration;
		// maximal speed in m/s
		float maxSpeed;
		
		//Marker for big Numbers
		Boolean bigValueMarker = false;

		//Switch-case for various spaceships		
		switch(raumschiffindex){
			
			case 1 : 
				acceleration = 10;
				maxSpeed = 2000;
				break;
		
			case 2 : 
				acceleration = 8;
				maxSpeed = 3200f;
				break;
			
			case 3 :
				acceleration = 230.0f;
				maxSpeed = 130000;
				break;
			
			default : 
				acceleration = 10;
				maxSpeed = 2000;
				break;
		}
		
		//Switch-Case for various destinations
		switch(zielindex){
			
			case 1 : 
				distance = 363000;
				break;
			
			case 2 :
				distance = 56000000;
				break;
				
			case 3 :
				distance = 588000000;
				System.out.println("Very big values! You have to calculate with BigIntegern/BigDecimal \n" +
						"Results are rounded!!");
				bigValueMarker = true;
				break;
				
			default :
				distance = 363000;
				System.out.println("No valid destination input!");
				break;
		}
		
		// seconds needed to accelerate (or brake)
		float accelerationTime = (maxSpeed / acceleration);
		
		// traveled distance in m after acceleration
		float accelerationDistance = (acceleration * accelerationTime * accelerationTime) / 2;
		
		// remaining distance in m without acceleration and braking
		float remainingDistance = (distance * 1000) - 2 * accelerationDistance;
		
		if(!bigValueMarker){
			
			// seconds needed to travel the remaining distance
			float remainingTime = remainingDistance / maxSpeed;
		
			// travel time: acceleration + flight at maxSpeed + braking
			float travelTime = (remainingTime + 2 * accelerationTime) / 3600; 
			System.out.println(travelTime);
		}
		
		//calculation for big values
		else
		{	
			//initialize BigInteger values
			BigInteger dist = new BigInteger("588000000");
			BigInteger a = new BigInteger("1000");
			BigInteger b = new BigInteger("2");
			
			//convert values to BigInteger
			BigInteger acc = new BigInteger(Integer.toString(Math.round(acceleration)));
			BigInteger accDist = new BigInteger(Integer.toString(Math.round(accelerationDistance)));
			BigInteger maxSp = new BigInteger(Integer.toString(Math.round(maxSpeed)));
			
			//calculate remaining Distance
			BigInteger reDist = new BigInteger(dist.multiply(a).toString());			
			b = b.multiply(accDist);
			reDist = reDist.subtract(b);
			System.out.println("remainingDistance: "+reDist.longValue());
			
			//calculate remainingTime
			BigInteger reTime = new BigInteger(reDist.divide(maxSp).toString());
			System.out.println("remainingTime: "+reTime.longValue());
			
			//calculate accelerationTime 
			BigInteger accTime = new BigInteger(maxSp.divide(acc).toString());
			
			//calculate travel Time
			BigInteger trTime = new BigInteger(accTime.multiply(new BigInteger("2")).toString());
			trTime = trTime.add(reTime);
			trTime = trTime.divide(new BigInteger("3600"));
			System.out.println("travelTime: "+trTime.longValue());

		}
	}
}
