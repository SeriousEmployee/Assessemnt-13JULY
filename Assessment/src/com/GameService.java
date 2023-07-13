package com;

import java.util.ArrayList;
import java.util.List;

public class GameService {
	static private List<Game> games = new ArrayList<Game>();
	
	public GameService() {
		games.clear();
		games.add(new Game("SnowBird", "Danny", 300));
		games.add(new Game("FreshFood", "Ram", 400));
		games.add(new Game("Batsman", "Kate", 400));
		games.add(new Game("Pokiman", "Steeve", 600));
		games.add(new Game("YammyTommy", "Narayan", 350));
	}
	
	public List<Game> viewAll(){
		return games;
	}
	
	public String authorSearch(String author) {
		if(author==null) {
			return "NOT FOUND";
		}
		for(Game g:games) {
			if(author.equals(g.getAuthorName())) {
				return g.getGameName();
			}
		}
		return "NOT FOUND";
	}
}
