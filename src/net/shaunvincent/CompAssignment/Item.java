package net.shaunvincent.CompAssignment;

public class Item {

    /** private static int adjectiveIndex = (int) (Math.random() * GameData.itemAdjectives.length);
    private static int nounIndex = (int) (Math.random() * GameData.itemNouns.length);

    public String itemName = GameData.itemAdjectives[adjectiveIndex] + " " + GameData.itemNouns[nounIndex];

    public String[] itemList = new String[GameController.MAP_LOCATIONS];**/

    private String itemName;

    public Item() {
        itemName = GameData.getRandomItemName();
    }
    public String toString() {
        return itemName;
    }
}
