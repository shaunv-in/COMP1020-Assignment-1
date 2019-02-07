package net.shaunvincent.CompAssignment;

public class Monster {

    private String name;
    private int difficulty;

    public Monster(int newDifficulty) {
        difficulty = newDifficulty;
        name = GameData.getMonsterNameByDifficulty(difficulty);
    }

    public String toString() {
        return name;
    }
}
