package net.shaunvincent.CompAssignment;

public class Location {

    private Monster currentMonster;
    private Item currentItem;

    private int difficulty;
    private String locationName;

    public Location(int newDifficulty) {

        difficulty = newDifficulty;
        locationName = GameData.getRandomLocationName();
        currentMonster = new Monster(newDifficulty);

        if(GameData.randomRoll(0,2) == 1) {
            currentItem = new Item();
            currentItem.toString();
        }
        else if(GameData.randomRoll(0,2) == 0) {
            currentItem = null;
        }
    }

    public String toString() {
        if(hasTreasure()) {
            return locationName + " (D:" + difficulty + ")\nYou see a " + currentItem.toString() + " in the corner.\nThere is a " +
                    currentMonster.toString() + " guarding the treasure.";
        }
        else {
            return locationName + " (D:" + difficulty + ")\nYou dont see anything worth taking here. \nThere is a " +
                    currentMonster.toString() + " guarding the treasure.";
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

    public Item stealTreasure() {
        return currentItem;
    }
}
