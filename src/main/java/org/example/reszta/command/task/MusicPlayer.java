package org.example.reszta.command.task;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private List<String> tracks = Arrays.asList("Track 1", "Track 2", "Track 3");
    private int currentTrackNumber = 0;

    public void playFirstTrack() {
        currentTrackNumber = 0;
        System.out.println("Gram pierwszy utwór: " + tracks.get(currentTrackNumber));
    }

    public void playNextTrack() {
        currentTrackNumber++;
        if (currentTrackNumber > 2) {
            currentTrackNumber = 0;
        }
        System.out.println("Gram kolejny utwór: " + tracks.get(currentTrackNumber));
    }

    public void playRandomTrack() {
        Random random = new Random();
        currentTrackNumber = random.nextInt(tracks.size());
        System.out.println("Gram losowy utwór " + tracks.get(currentTrackNumber));
    }
}
