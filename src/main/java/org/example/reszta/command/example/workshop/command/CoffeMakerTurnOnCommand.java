package org.example.reszta.command.example.workshop.command;

import org.example.reszta.command.example.workshop.CoffeMaker;

public class CoffeMakerTurnOnCommand implements Command{

    private CoffeMaker coffeMaker;

    public CoffeMakerTurnOnCommand(CoffeMaker coffeMaker) {
        this.coffeMaker = coffeMaker;
    }

    @Override
    public void execute() {
        coffeMaker.turnOn();
    }

    @Override
    public void undo() {
        coffeMaker.turnOff();
    }
}
