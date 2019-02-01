package net.shaunvincent.CompAssignment;

public class Location { ;
    private String newLocation;

    private int difficulty;

    Item treasure;

    Item tempTreasure = null;

    public Location(int newDifficulty) {

        difficulty = newDifficulty;
        newLocation = GameData.getRandomLocationName();

        if(GameData.randomRoll(0,2) == 1){
            treasure = new Item();

        }
        else if(GameData.randomRoll(0,2) == 0){
            treasure = null;
        }

    }

    public String toString(){
        return newLocation;
    }

    public boolean hasTreasure(){

        if(treasure == null){
            return false;
        }
        else{
            return true;
        }

    }

//    public stealTreasure(){
//
//        treasure = tempTreasure;
//        return tempTreasure;
//
//    }
}
