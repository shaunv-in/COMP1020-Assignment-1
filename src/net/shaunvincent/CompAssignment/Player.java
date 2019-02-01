package net.shaunvincent.CompAssignment;

public class Player {

    private String playerName;
    private int currentHP;
    private int STARTING_HP = 8;

    public Player() {
        playerName = GameData.getRandomName();
        currentHP = STARTING_HP;
    }
    public String toString(){

        return "\n\n---------------------------\n" + "Current player:  " + playerName + "\nCurrent HP:  " + currentHP + "\n---------------------------\n\n";

    }



}
