package net.shaunvincent.CompAssignment;

public class GameController {

    private static final int MAP_LOCATIONS = 6;

    private static Location[] map;
    private Player currentPlayer;

    //Main method runs the the entire game
    public static void main(String[] args) {

        //Initializing game
        GameController game = new GameController();

        //Calling initializeMap method
        game.initializeMap(MAP_LOCATIONS);

        //Calling startGame method
        game.startGame();
    }

    //Runs the map
    public void initializeMap(int numberOfLocations) {

        // Initialize The Map
        map = new Location[numberOfLocations];

        //Initializing each location in the map
        for(int i=0; i< numberOfLocations;i++) {
            map[i] = new Location(i);
        }

    }

    //Method for each location
    private void enterLocation(Location locationPosition) {
        //Prints out the location
        System.out.println("You enter a " + locationPosition.toString() + "\n" + currentPlayer.getPlayerName()
                + " encounters a " + locationPosition.getMonster());

        //Checking if the location has treasure
        if(locationPosition.hasTreasure()) {
            currentPlayer.addItem(locationPosition.stealTreasure());
        }

        //Styling
        System.out.println("----- End of Location -----\n");
    }

    //Method for Game start with player details, locations and game ending
    public void startGame() {

        //Initializing the currentPlayer variable
        currentPlayer = new Player();

        //Prints out current Player
        System.out.println(currentPlayer.toString());

        //Prints out the current Items
        for(int i=0; i< MAP_LOCATIONS;i++) {
            enterLocation(map[i]);
        }

        //Referencing the current items
        System.out.println("\n" + currentPlayer.getPlayerName() + " made it to the end and escaped with:\nCurrent Items:" + currentPlayer.getItemsCollected());

        //Styling
        System.out.println("\n--- The End --- \n");
    }

}