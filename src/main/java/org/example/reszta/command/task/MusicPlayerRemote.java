package org.example.reszta.command.task;

import org.example.reszta.command.task.command.MusicPlayerCommand;

public class MusicPlayerRemote {

    private MusicPlayerCommand musicPlayerCommand;

    public void setMusicPlayerCommand(MusicPlayerCommand musicPlayerCommand) {
        this.musicPlayerCommand = musicPlayerCommand;
    }


    public void pressButton() {
        musicPlayerCommand.play();
    }
}
