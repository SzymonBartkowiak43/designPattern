package org.example.reszta.command.example.workshop.command;

import org.example.reszta.command.example.workshop.Robot;

public class RobotCutCommand implements Command{
    private Robot robot;

    public RobotCutCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.cut();
    }

    @Override
    public void undo() {

    }
}
