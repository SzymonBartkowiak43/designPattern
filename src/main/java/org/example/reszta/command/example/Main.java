package org.example.reszta.command.example;

import org.example.reszta.command.example.workshop.CoffeMaker;
import org.example.reszta.command.example.workshop.Robot;
import org.example.reszta.command.example.workshop.WorkshopApp;
import org.example.reszta.command.example.workshop.command.*;

public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot();
        WorkshopApp workshopApp = new WorkshopApp();
//
//        workshopApp.addToQueue(new RobotTurnOnCommand(robot));
//        workshopApp.addToQueue(new RobotCutCommand(robot));
//        workshopApp.addToQueue(new RobotDrillCommand(robot));
//        workshopApp.addToQueue(new RobotTurnOffCommand(robot));
//
//        workshopApp.run();
//        workshopApp.run();
//
//        CoffeMaker coffeMaker = new CoffeMaker();
//
//        workshopApp.addToQueue(new CoffeMakerTurnOnCommand(coffeMaker));
//        workshopApp.addToQueue(new CoffeMakerTurnOffCommand(coffeMaker));

        workshopApp.addToQueue(new RobotTurnOnCommand(robot));
        workshopApp.run();
        workshopApp.undoLastCommand();
    }
}
