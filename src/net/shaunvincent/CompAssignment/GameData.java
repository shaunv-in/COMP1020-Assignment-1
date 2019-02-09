package net.shaunvincent.CompAssignment;
// Game Data - Phase 3
// Returns a Random Location Name
// and contains the basic random number generator

public class GameData {

    // ======== Source Words ========
    // Phase 0 - a random list of words to generate a random location
    private static String[] locationAdjectives = {"Cold","Damp","Soggy","Hot","Dangerous","Dark","Bright","Cavernous"};
    private static String[] locationNouns = {"Cave","Hallway","Diner","Room"};

    // Phase 1 - a random list of words to generate a random name
    private static String[] randomNames = {"Dylan","Maxim","Thomas","Mehidi","Rayhan","Huayi","Zihan","Tasnimul","Elroy","Toluwani","Ravi","Nikita","Sheila","Yash","Nhan","Deep","Zilkumar","Saif","Moadil","Shivam","Ravdeep","Vishavbir","Seyed","Yongying","Nguyen","Shaun","Minh","Xunqing","Guohao","Zhijie","Sabid","Temiloluwa","Tai","Taeho","Oghenekome","Wynona","Jawad","Rafia","Zahirul","Petro","Zhuobin","Vikas","Binh","Nhat","Maisha","Chibuike","Nneka","Hinalben","Shrey","Muhammad","Mahdis","Abu","Sarabjit","Abdullah","Ayon","Daivum","Leonardo","Adrian","Wenqing","Huimin"};

    //Phase 2
    // Generate a random item name
    private static String[] itemAdjectives = {"Magic","Antique","Smelly","Rusted","Broken","Fragile","Glowing","Strange","Flaming"};
    private static String[] itemNouns = {"Hammer","Shield","Helmet","Shoes","Sword"};

    // Phase 3
    // this list is sorted by difficulty
    private static String[] monsterList = {"Tiny Mouse","Lizard","Fierce Rabbit","Blob Monster","Angry Goblin","Zombie Monster","Goblin King","Giant Spider","Venomous Dinosaur"};
    // ======== Name Generators ========

    // Phase 3
    // This method returns names of monsters.
    // The type of monster is determined by the difficulty of the location
    // we can use the difficulty as an index to get a monster from the list
    public static String getMonsterNameByDifficulty(int difficulty) {
        String returnMonster = "Default Monster";
        if( difficulty >= 0 && difficulty < monsterList.length) {
            returnMonster = monsterList[difficulty];
        }else{
            System.out.println("ERROR1: Monster index out of range " + difficulty);
        }
        return returnMonster;
    }

    // Phase 2
    public static String getRandomItemName() {
        int indexAdjective = randomRoll(0,itemAdjectives.length);
        int indexNoun = randomRoll(0,itemNouns.length);
        String returnName = itemAdjectives[indexAdjective] + " " + itemNouns[indexNoun];
        return returnName;
    }

    // Phase 1
    // Generate a random persons name from the list supplied above
    public static String getRandomName() {
        int index = randomRoll(0,randomNames.length);
        String name = randomNames[index];
        return name;
    }

    // Generates a random two word name for the net.shaunvincent.CompAssignment.Location and returns it.
    // Sample names could include: "Cold Cave", "Damp Hallway", "Soggy Room" etc.
    public static String getRandomLocationName() {
        // randomly roll to get the adjective.
        int indexAdjective = randomRoll(0, locationAdjectives.length);
        // randomly roll to get the noun.
        int indexNoun = randomRoll(0, locationNouns.length);

        String returnName = locationAdjectives[indexAdjective] + " " + locationNouns[indexNoun];
        return returnName;
    }

    // ======== Utility Functions ========
    // Roll a random int between min (inclusive) and max (exclusive)
    public static int randomRoll(int min, int max) {
        int randomNum = 0;

        randomNum = (int) (Math.random() * (max + min));

        return randomNum;
    }
}
