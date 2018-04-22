package com.example.awesomefat.dungeonsanddatastructures;

/**
 * Created by awesomefat on 3/29/18.
 */

public class Player {
    public String name;
    public int currentRoom_index;

    public Player(){}

    public Player(String name)
    {
        this.name = name;
        this.currentRoom_index = -1;
    }

    public void display() {
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public Room getCurrentRoom() {
        return Core.theDungeon.rooms.get(this.currentRoom_index);
    }

    public void setCurrentRoomIndex(int currentRoom_index) {
        this.currentRoom_index = currentRoom_index;
    }

    @Override
    public String toString() {
        return name;
    }
}
