package org.example.reszta.command.example.workshop.command;

import org.example.reszta.command.example.workshop.CoffeMaker;

public class CoffeMakerTurnOffCommand implements Command{

    private CoffeMaker coffeMaker;

    public CoffeMakerTurnOffCommand(CoffeMaker coffeMaker) {
        this.coffeMaker = coffeMaker;
    }

    @Override
    public void execute() {
        coffeMaker.turnOff();
    }

    @Override
    public void undo() {
        coffeMaker.turnOn();
    }
}
