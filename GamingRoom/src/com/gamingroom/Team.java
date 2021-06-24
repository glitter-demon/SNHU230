package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */
public class Team extends Entity{
	private List<Player> players = new ArrayList<Player>();
	
	// constructor
	public Team(long id, String name) {
		super(id, name);
	}
	public Player addPlayer(String name) {
	    // local instance
	    Player player = null;
	    // iterator for the instance
	    Iterator<Player> playersSearch = players.iterator();
	    // Iterate over players list
	    while (playersSearch.hasNext()) {
	        Player playerInstance = playersSearch.next();
	        // Search for a matching player name
	        // return a match if found, otherwise add the player to the list
	        if (playerInstance.getName().equalsIgnoreCase(name)) {
	            player = playerInstance;
	        } else {
	        	players.add(player);
	           }
	       }
	       return player;
	}
	@Override
	public String toString() {
		return "Team [id=" + super.getId() + ", name=" + super.getName() + "]";
	}
}
