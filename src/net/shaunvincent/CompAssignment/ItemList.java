package net.shaunvincent.CompAssignment;

public class ItemList {

    private int currentItemCount;
    private String items = "";

    private Item[] itemList;

    //ItemList constructor sets the item count and initializes itemList
    public ItemList() {
        currentItemCount = 0;
        //Initializing itemList
        itemList = new Item[100];
    }

    //Adding items to the itemList
    public void addItem(Item itemName) {
        itemList[currentItemCount] = itemName;
        currentItemCount++;
    }

    //Returns items in an ordered format
    public String toString() {
        for(int i=0;i<currentItemCount;i++) {
            items += "\n" + itemList[i];
        }
        return items;
    }
}