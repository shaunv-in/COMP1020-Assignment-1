package net.shaunvincent.CompAssignment;

public class Item {

    private String itemName;

    public Item() {
        itemName = GameData.getRandomItemName();
    }
    public String toString() {
        return itemName;
    }
}
