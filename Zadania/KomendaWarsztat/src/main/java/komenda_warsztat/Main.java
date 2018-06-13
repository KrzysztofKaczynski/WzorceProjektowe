package komenda_warsztat;

import komenda_warsztat.workshop.CoffeMaker;
import komenda_warsztat.workshop.Robot;
import komenda_warsztat.workshop.WorkShopApp;
import komenda_warsztat.workshop.command.*;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot();
        WorkShopApp workShopApp = new WorkShopApp();
     /*   workShopApp.addToQueue(new RobotTurnCommand(robot));
        workShopApp.addToQueue(new RobotCutCommand(robot));
        workShopApp.addToQueue(new RobotDrillCommand(robot));
        workShopApp.addToQueue(new RobotTurnOffCommand(robot));

        workShopApp.run();
        workShopApp.run();

        CoffeMaker coffeMaker = new CoffeMaker();
        workShopApp.addToQueue(new CoffeMakerTurnOnCommand(coffeMaker));
        workShopApp.addToQueue(new CoffeMakerTurnOffCommand(coffeMaker));
        workShopApp.run();*/

        workShopApp.addToQueue(new RobotTurnCommand(robot));
        workShopApp.run();
        workShopApp.undoLastCommand();
    }
}
