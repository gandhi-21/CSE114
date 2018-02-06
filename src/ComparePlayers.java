// **********************************************************
// ComparePlayers
//
// Reads in two Player objects and tells whether they represent
// the same player.
// **********************************************************

import java.util.*;

public class ComparePlayers
{
    public static void main(String[] args)
    {
      Player player1 = new Player();
      Player player2 = new Player();
      
      player1.setName("player 1");
      player1.setNumber(21);
      player1.setTeam("AA");
      
      player2.setName("Star");
      player2.setNumber(21);
      player2.setTeam("AA");

      //Prompt for and read in information for player 1

      //Prompt for and read in information for player 2
      
      //Compare player1 to player 2 and print a message saying
      //whether they are equal
      if(player1.equals(player2)==true)
      {
    	  System.out.println("Same Player");
      }
      else
    	  System.out.println("Different PLayers");

    }
}
