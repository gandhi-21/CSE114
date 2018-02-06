// **********************************************************
// Player.java
//
// Defines a Player class that holds information about an athlete.
// **********************************************************

public class Player
{
    private String name;
    private String team;
    private int jerseyNumber;

    //-----------------------------------------------------------
    // Prompts for and reads in the player's name, team, and
    // jersey number.
    //-----------------------------------------------------------

    public void setName(String name)
    {
    	this.name = name;
    }

    public void setTeam (String team)
    {
    	this.team = team;
    }

    public void setNumber(int number)
    {
    	jerseyNumber = number;
    }

    	public String getName()
    	{
    		return name;
    	}
    	
    	public String getteam()
    	{
    		return team;
    	}
    	
    	public int getJersey()
    	{
    		return jerseyNumber;
    	}
    	
    	public boolean equals(Player p2)
    	{
    		if(p2.getJersey()==jerseyNumber)
    		{
    			if(p2.getteam().equals(team))
    				return true;
    		}
    		return false;
    	}
}
