package net.shaunvincent.CompAssignment;

public class GameController{
    // Phase 0
    private static final int MAP_LOCATIONS = 6;

    private static Location[] map;

    private Player currentPlayer;

    public static void main(String[] args){

        GameController game = new GameController();

        game.initializeMap(MAP_LOCATIONS);
        game.startGame();

    }

    public void initializeMap(int numberOfLocations){

        // Initialize The Map

        map = new Location[MAP_LOCATIONS];

        for(int i=0; i< MAP_LOCATIONS;i++){
            map[i] = new Location(i);
        }

    }

    public void startGame(){

        currentPlayer = new Player();

        System.out.println(currentPlayer.toString());

        // Prints out location

        for(int i=0; i< MAP_LOCATIONS;i++){
            System.out.println("You enter a " + map[i].toString() + " (D:"+ i + ")");
            System.out.println("You don't see anything worth taking here");
        }

        // Print out the map
        System.out.println("\n\n --- The End --- \n\n");
    }

}