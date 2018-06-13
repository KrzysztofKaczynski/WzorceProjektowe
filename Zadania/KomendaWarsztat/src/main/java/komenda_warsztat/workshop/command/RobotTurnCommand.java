package komenda_warsztat.workshop.command;

import komenda_warsztat.workshop.Robot;

public class RobotTurnCommand implements Command{

    private Robot robot;

    public RobotTurnCommand(Robot robot) {
        this.robot = robot;
    }

    public void execute() {
        robot.turnOn();
    }

    public void undo() {
        robot.turnOff();
    }
}
