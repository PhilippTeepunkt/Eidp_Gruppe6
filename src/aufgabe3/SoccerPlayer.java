package aufgabe3;

public class SoccerPlayer {
	
	private String playerName;
	private String soccerTeam;
	private int playerNumber;
	private int numberOfGoals;
	private int yellowCard;
	private Boolean redCard;
	
	public SoccerPlayer(String name, String team){
		
		playerName = name;
		soccerTeam = team;
		playerNumber = 0;
		numberOfGoals = 0;
		yellowCard = 0;
		redCard = false;
	}
	
	public void redCard(){
		redCard = true;		
	}
	
	public void yellowCard(){
		
		if(yellowCard>0){
			redCard();
		}
		else{
			yellowCard ++;
		}
	}
	
	public void setNumber(int number){
		playerNumber = number;
	}
	
	public int getNumber(){
		return playerNumber;
	}
	
	public String getName(){
		return playerName;
	}
	
	public String getTeam(){
		return soccerTeam;
	}
	
	public void setTeam(String team){
		soccerTeam = team;
	}
	
	public void increaseGoalCount(){
		numberOfGoals++;
	}
	
	public String toString(){
		return getName()+", "+getNumber()+", "+getTeam()+", "+numberOfGoals;
	}
}
