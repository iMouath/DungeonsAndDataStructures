package com.example.awesomefat.dungeonsanddatastructures;

/**
 * Created by awesomefat on 3/29/18.
 */

public class Exit
{
    public int r1_index;
    public int r2_index;

    public Exit(){}

    public Exit(int r1_index, int r2_index)
    {
        this.r1_index = r1_index;
        this.r2_index = r2_index;
    }

    public boolean takeExit(Player p)
    {
        //make the player move to the room they are NOT currently in.
//        if(p.getCurrentRoom() == this.r1)
//        {
//            this.r1.removePlayer(p);
//            this.r2.addPlayer(p);
//            return true;
//        }
//        else if(p.getCurrentRoom() == this.r2)
//        {
//            this.r2.removePlayer(p);
//            this.r1.addPlayer(p);
//            return true;
//        }
        return false;
    }
}
