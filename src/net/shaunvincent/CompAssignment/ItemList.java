package net.shaunvincent.CompAssignment;

public class ItemList {

    private int currentItemCount;
    private String items = "";

    private Item[] itemList;

    public ItemList() {
        currentItemCount = 0;
        itemList = new Item[100];
    }

    public void addItem(Item itemName) {
        itemList[currentItemCount] = itemName;
        currentItemCount++;
    }

    public String toString() {
        for(int i=0;i<currentItemCount;i++) {
            items += "\n" + itemList[i];
        }
        return items;
    }
}