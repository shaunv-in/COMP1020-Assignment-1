package net.shaunvincent.CompAssignment;

public class GameController {

    private static final int MAP_LOCATIONS = 6;

    private static Location[] map;
    private Player currentPlayer;

    public static void main(String[] args) {

        //Initializing game
        GameController game = new GameController();

        //Calling initializeMap method
        game.initializeMap(MAP_LOCATIONS);

        //Calling startGame method
        game.startGame();
    }

    public void initializeMap(int numberOfLocations) {

        // Initialize The Map
        map = new Location[numberOfLocations];

        for(int i=0; i< numberOfLocations;i++) {
            map[i] = new Location(i);
        }

    }

    private void enterLocation(Location locationPosition) {
        //Prints out the location
        System.out.println("You enter a " + locationPosition.toString());

        //Checking if the location has treasure
        if(locationPosition.hasTreasure()) {
            currentPlayer.addItem(locationPosition.stealTreasure());
        }

        //Styling
        System.out.println("----- End of Location -----\n");
    }

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
        System.out.println("\nYou made it to the end. Your loot bag contains:\nCurrent Items:" + currentPlayer.getItemsCollected());

        //Styling
        System.out.println("\n--- The End --- \n\n");
    }

}