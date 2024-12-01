package org.example.reszta.command.task.command;

import org.example.reszta.command.task.MusicPlayer;

public class PlayRandomTrack implements MusicPlayerCommand{

    private MusicPlayer musicPlayer;

    public PlayRandomTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playRandomTrack();
    }
}
