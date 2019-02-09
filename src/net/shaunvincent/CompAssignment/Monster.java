package net.shaunvincent.CompAssignment;

public class Monster {

    private String name;
    private int difficulty;

    //Monster constructor sets the monster name by difficulty
    public Monster(int newDifficulty) {
        difficulty = newDifficulty;
        name = GameData.getMonsterNameByDifficulty(difficulty);
    }

    //Returns the monster name
    public String toString() {
        return name;
    }
}
