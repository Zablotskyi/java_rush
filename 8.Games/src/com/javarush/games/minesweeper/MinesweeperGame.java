package com.javarush.games.minesweeper;

import com.javarush.engine.cell.*;

public class MinesweeperGame extends Game {

    private static final int SIDE = 9;
    public void initialize() {
        this.setScreenSize(9, 9);
        createGame();
    }
    private GameObject gameField[][] = new GameObject[SIDE][SIDE];
    private void createGame() {

        for (int x = 0; x < gameField.length; x ++) {
            for (int y = 0; y < gameField[x].length; y ++) {
                gameField[y][x] = new GameObject(x, y);
                setCellColor(x, y, Color.ORANGE);
            }
        }
    }

}
