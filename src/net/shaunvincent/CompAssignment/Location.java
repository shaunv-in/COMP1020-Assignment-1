package net.shaunvincent.CompAssignment;

public class Location {

    private Monster currentMonster;
    private Item currentItem;

    private int difficulty;
    private String locationName;

    //Location constructor sets the difficulty of the location and locationName
    public Location(int newDifficulty) {

        difficulty = newDifficulty;
        locationName = GameData.getRandomLocationName();

        //Initializing currentMonster
        currentMonster = new Monster(newDifficulty);

        if(GameData.randomRoll(0,2) == 1) {
            currentItem = new Item();
        }
        else if(GameData.randomRoll(0,2) == 0) {
            currentItem = null;
        }
    }

    public int getDifficulty(){
        return difficulty;
    }

    //Returns location name, item collected and monster name
    public String toString() {

        if(hasTreasure()) {
            return locationName + " (D:" + difficulty + ")\nYou see a " + currentItem + " in the corner.\nThere is a " +
                    getMonster() + " guarding the treasure.";
        }
        else {
            return locationName + " (D:" + difficulty + ")\nYou dont see anything worth taking here. \nThere is a " +
                    getMonster() + " guarding the treasure.";
        }
    }

    //Checks for treasure
    public boolean hasTreasure() {

        if(stealTreasure() == null) {
            return false;
        }
        else {
            return true;
        }

    }

    //Returns the currentItem
    public Item stealTreasure() {
        return currentItem;
    }

    //Returns the currentMonster
    public Monster getMonster(){
        return currentMonster;
    }
}
