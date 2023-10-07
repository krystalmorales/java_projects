package learn.gomoku;

import learn.gomoku.ui.GameController;

public class App {

    public static void main(String[] args) {
        GameController gameController = new GameController();
        gameController.run();
    }
}
