package learn.gomoku.ui;

import learn.gomoku.players.HumanPlayer;
import learn.gomoku.players.Player;
import learn.gomoku.players.RandomPlayer;

import java.util.Random;
import java.util.Scanner;

public class GameController {

    private final static int WIDTH = 15;
    private final static char[] WALL_CHARACTER; //loop for index rows and columns
    private final static char[] DASH_CHARACTER = '-';

    private final Scanner console = new Scanner(System.in);

    private Player name;

    private boolean isOver;

    public void run() {
        setUp();
        while (!isOver) {
            play(); // display board here
            playAgain();
        }
    }

    private void setUp() {
        boolean isOVer = true;
        while (isOVer) {
            System.out.println("Welcome to Gomoku");
            System.out.println("=================");
            getPlayer(1-2); //what int goes here?
            //rest board??
        }
    }

    private Player getPlayer(int playerNumber){
                System.out.println("Player 1 is: ");
                System.out.println("1. Human\n 2. Random");
                playerNumber = readInt("Select [1-2]: ", 1, 2);
                if (playerNumber == 1) {
                    String name = readRequiredString("Enter name of user: ");
                    HumanPlayer humanPlayerOne = new HumanPlayer(name); // do you instantiate inside a loop??
                } else {
                    RandomPlayer randomPlayer = new RandomPlayer();
                }

                System.out.println("Player 2 is: ");
                System.out.println("1. Human\n 2. Random");
                playerNumber = readInt("Select [1-2]: ", 1, 2);
                if (playerNumber == 1) {
                    String nameTwo = readRequiredString("Enter name of user: ");
                    HumanPlayer humanPlayerTwo = new HumanPlayer(nameTwo); // do you instantiate inside a loop??
                } else {
                    RandomPlayer randomPlayerTwo = new RandomPlayer();
                }

        return getPlayer(playerNumber); //what do i return?
    }

    private void play(){
        printBoard();

    }

    private String readRequiredString(String prompt) {
        String input;

        do {
            System.out.print(prompt);
            input = console.nextLine();
        } while (input.length() == 0);

        return input;
    }

    private int readInt(String prompt) {
        System.out.println(prompt);
        return Integer.parseInt(console.nextLine());
    }


    private int readInt(String prompt, int min, int max){
        int val;
        do {
            val = Integer.parseInt(readRequiredString(prompt));
        } while (val < min || val > max);
        return val;
    }
}
