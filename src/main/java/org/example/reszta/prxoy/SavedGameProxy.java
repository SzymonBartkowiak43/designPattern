package org.example.reszta.prxoy;

public class SavedGameProxy implements SavedGame{

    private String name;
    private SavedGame sg;

    @Override
    public void initialize() {
        this.name = "Save game - " + String.valueOf(System.currentTimeMillis());
    }

    @Override
    public void loadGame() {
        sg = new SavedGameFull();
        sg.initialize();
        sg.loadGame();
    }

    @Override
    public String getName() {
        return name;
    }
}
