package aufgabe3;

public class SoccerTeam {
	
	private String teamName;
	private Trainer teamTrainer;
	private int anzahlTore;
	private int anzahlGegentore;
	private int tabellenPosition;
	private SoccerPlayer[]players;
	
	//constructor
	public SoccerTeam(String name, Trainer trainer,int position) {
		
		players = new SoccerPlayer[10];
		teamName = name;
		teamTrainer = trainer;
		tabellenPosition = position;
		
	}
	
	//add Player
	public void addPlayer(String name){
		//checks if the player is already part of the team
		if(!contains(players,name)){
		
			//init new player
			SoccerPlayer sp = new SoccerPlayer(name, teamName);
			
			//adds the player at a free position in the array
			for(int i = 0;i<players.length;i++){
				if(players[i]==null){
					players[i]=sp;
					sp.setNumber(i+1);
					break;
				}
				//checks if the team is already full
				if(i==players.length-1){
					System.out.println("Team is full");
				}
			}
		}
		else {
			System.out.println(name+" is already part of the Team!");
		}
	}
	
	public void goal(int playerNumber){
		anzahlTore++;
		players[playerNumber-1].increaseGoalCount();
	}
	
	public void goalAgainst(){
		anzahlGegentore++;
	}
	
	public String ratioString(){
		return anzahlTore+":"+anzahlGegentore;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(teamName);
		sb.append(System.getProperty("line.separator"));
		sb.append(teamTrainer.getName());
		sb.append(System.getProperty("line.separator"));
		sb.append(anzahlTore+" geschossen");
		sb.append(System.getProperty("line.separator"));
		sb.append(anzahlGegentore+" kassiert");
		sb.append(System.getProperty("line.separator"));
		sb.append(ratioString());
		sb.append(System.getProperty("line.separator"));
		
		//returns all players part of the team
		for(int i=0;i<players.length;i++){
			while(players[i]!=null){
				sb.append(players[i].getName());
				sb.append(System.getProperty("line.separator"));
			}
			break;
		}
		return sb.toString();
	}
	
	//helper method for checking if an array contains a specific player
	public static boolean contains(SoccerPlayer[]player, String name){
		
		for (int i=0; i<player.length;i++){
			if(player[i].getName()==name)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;
	
	}
	
}
