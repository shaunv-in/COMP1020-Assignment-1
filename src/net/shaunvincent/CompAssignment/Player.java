package net.shaunvincent.CompAssignment;

public class Player {

    private String playerName;
    private int currentHP;
    private int STARTING_HP = 8;

    private ItemList listOfItems;

    public Player() {

        //Initializing listOfItems
        listOfItems = new ItemList();
        playerName = GameData.getRandomName();
        currentHP = STARTING_HP;
    }

    public void addItem(Item itemRef) {
        listOfItems.addItem(itemRef);
    }

    public String getItemsCollected() {
        return "\n" + listOfItems.toString();
    }

    public String toString() {
        return "\n\n---------------------------\n" + "Current player:  " + playerName + "\nCurrent HP:  " + currentHP +
                "\n---------------------------\n\n";
    }
}
