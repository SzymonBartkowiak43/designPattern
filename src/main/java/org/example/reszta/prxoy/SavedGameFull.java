package org.example.reszta.prxoy;

import static java.lang.Thread.sleep;

public class SavedGameFull implements SavedGame {
    private String name;
    private String gameData;
    public void initialize() {
        this.name = "Save game - " + String.valueOf(System.currentTimeMillis());
        this.gameData = loadFromStorage();
    }

    public void loadGame() {
        System.out.println("Game loaded");
    }

    private String loadFromStorage() {
        try {
            sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "Loaded";
    }

    public String getName() {
        return name;
    }

    public String getGameData() {
        return gameData;
    }
}
