package analytics;

import java.util.ArrayList;
import java.util.Random;

public class TestData {
	ArrayList<Game> list;
	Random ran;
	TestData(){
		list = new ArrayList<Game>();
		ran = new Random();
	}
	public int getRand(){
		return ran.nextInt();
	}
	public void creategames(){
		Team team1 = new Team("Dallas","Cowboys");
		Team team2 = new Team("Chicago","Bears");
		Team team3 = new Team("Detroit","Lions");
		Team team4 = new Team("Houston","Texans");
		Game game1 = new Game(team1,team2,1);
		Game game2 = new Game(team3,team4,2);
		Game game3 = new Game(team2,team4,1);
		Game game4 = new Game(team1,team3,2);
		Game game5 = new Game(team1,team4,1);
		list.add(game1);
		list.add(game2);
		list.add(game3);
		list.add(game4);
		list.add(game5);	
	}
	public void printInfo(){
		for(int a=0;a<5;a++){
			Game temp = list.get(a);
			
		}
	}
	
}
