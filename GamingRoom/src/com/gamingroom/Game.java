package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 */
public class Game extends Entity{
	private List<Team> teams = new ArrayList<Team>();

    // create game object
    public Game(long id, String name) {
        super(id, name);
    }
   
    
    public Team addTeam(String name) {
    	Team team = null;
    	// iterator for teams
    	Iterator<Team>teamSearch = teams.iterator();
    	Team teamInstance = null;
    	// set local var to next in list
    	while (teamSearch.hasNext()) {
    		teamInstance = teamSearch.next();
    	}
    	// search for a matching team name
    	if (((Entity) teamSearch).getName().equalsIgnoreCase(name)) {
    		team = teamInstance;
    	} else {
    		teams.add(team);
    	}
    	return team;
    }


    @Override
    public String toString() {
        return "Game [id=" + super.getId() + ", name=" + super.getName() + "]";

    }
}
