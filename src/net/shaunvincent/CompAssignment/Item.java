package net.shaunvincent.CompAssignment;

public class Item {

    private String itemName;

    //Item constructor sets the itemName
    public Item() {
        itemName = GameData.getRandomItemName();
    }

    //Returns the itemName
    public String toString() {
        return itemName;
    }
}
