package com.example.awesomefat.dungeonsanddatastructures;

import com.google.firebase.database.Exclude;

import java.util.Random;

/**
 * Created by awesomefat on 3/29/18.
 */

public class NPC extends Thread {
    //public String name;
    public int currentRoom_index;

    public NPC(){}

    public NPC(String name)
    {
        //this.name = name;
        this.currentRoom_index = -1;
    }

    /*
    Make our NPCs wander from room to room at random intervals
    and make sure to update the visible interface for the player
    so they immediately see an NPC walk in.  You should have NPCs
    randomly select a valid exit from the room they are currently in
     */
    public void run() {
        Random r = new Random();

        while (true) {
            try {
                sleep(r.nextInt(10000) + 1000);
                //System.out.printf()
                for (String direction : this.getCurrentRoom().exits.keySet()) {
                    System.out.println(direction);
                    this.getCurrentRoom().takeExit(direction);
                }
//                System.out.println(String.format("**** NPC %s says: %s", this.getName(), "Woot"));
                //Log.v("***Says", "Woot");
            } catch (Exception e) {
            }
        }
    }

    public void display() {
        //System.out.println(this.name);
    }

    public String getNPCName() {
        return "";//name;
    }

    @Exclude
    public Room getCurrentRoom() {
        return Core.theDungeon.rooms.get(this.currentRoom_index);
    }

    public void setCurrentRoomIndex(int currentRoom_index) {
        this.currentRoom_index = currentRoom_index;
    }
}
