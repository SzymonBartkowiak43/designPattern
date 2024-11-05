package org.example.reszta.prxoy;

import static java.lang.Thread.sleep;

public interface SavedGame {

    void initialize();

    void loadGame();

    String getName();


}
