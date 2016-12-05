package analytics;

public class Game {
	Team team1; 
	Team team2;
	int winner;
	public Team getwinner(){
		if(winner==1){
			return team1;
		} else{
			return team2;
		}
	}
	public Game(Team t, Team t2,int winner){
		this.team1=t;
		this.team2=t2;
		this.winner=winner;
		if(winner==1){
			t.wins++;
		}else{
			t.wins++;
		}
	
	
	}
	
}
