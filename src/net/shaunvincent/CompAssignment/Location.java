package net.shaunvincent.CompAssignment;

public class Location {

    private String newLocation;

    private int difficulty;

    private String treasure;
    private Item currentItem;

    private String tempTreasure = null;

    public Location(int newDifficulty) {

        difficulty = newDifficulty;
        newLocation = GameData.getRandomLocationName();

        if(GameData.randomRoll(0,2) == 1) {
            currentItem = new Item();
            treasure = currentItem.toString();
        }
        else if(GameData.randomRoll(0,2) == 0) {
            treasure = null;
        }
    }

    public String toString() {
        if(hasTreasure()) {
            return newLocation + " (D:" + difficulty + ")\nYou see a " + tempTreasure + " in the corner.\n";
        }
        else {
            return newLocation + " (D:" + difficulty + ")\nYou dont see anything worth taking here. \n";
        }
    }

    public boolean hasTreasure() {

        if(stealTreasure() == null) {
            return false;
        }
        else {
            return true;
        }

    }

    public String stealTreasure() {
        tempTreasure = treasure;
        treasure = null;
        return tempTreasure;
    }
}
