package org.example.reszta.command.task.command;

import org.example.reszta.command.task.MusicPlayer;

public class PlayNextTrack implements MusicPlayerCommand{

    private MusicPlayer musicPlayer;

    public PlayNextTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playNextTrack();
    }
}
