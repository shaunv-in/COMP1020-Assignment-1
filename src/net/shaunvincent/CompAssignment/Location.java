package net.shaunvincent.CompAssignment;

public class Location {

    private String newLocation;

    private int difficulty;

    private String treasure;
    private Item currentItem;
    private Monster currentMonster;
    private String Monster;

    private String tempTreasure = null;

    public Location(int newDifficulty) {

        difficulty = newDifficulty;
        newLocation = GameData.getRandomLocationName();
        currentMonster = new Monster(newDifficulty);
        Monster = currentMonster.toString();

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
            return newLocation + " (D:" + difficulty + ")\nYou see a " + tempTreasure + " in the corner.\nThere is a " +
                    Monster + " guarding the treasure.";
        }
        else {
            return newLocation + " (D:" + difficulty + ")\nYou dont see anything worth taking here. \nThere is a " +
                    Monster + " guarding the treasure.";
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
