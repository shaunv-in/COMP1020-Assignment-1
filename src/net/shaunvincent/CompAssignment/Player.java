package net.shaunvincent.CompAssignment;

public class Player {

    private String playerName;
    private int currentHP;
    private int STARTING_HP = 8;

    private ItemList listOfItems;

    //Player constructor sets the playerName and HP
    public Player() {

        //Initializing listOfItems
        listOfItems = new ItemList();
        playerName = GameData.getRandomName();
        currentHP = STARTING_HP;
    }

    //Adds item to by calling reference
    public void addItem(Item itemRef) {
        listOfItems.addItem(itemRef);
    }

    //Returns the collected items list
    public String getItemsCollected() {
        return "\n" + listOfItems.toString();
    }

    //Returns player name
    public String getPlayerName(){
        return playerName;
    }

    //Returns the Player informations
    public String toString() {
        return "\n\n---------------------------\n" + "Current player:  " + playerName + "\nCurrent HP:  " + currentHP +
                "\n---------------------------\n\n";
    }
}
