package komenda_warsztat.workshop.command;

import komenda_warsztat.workshop.Robot;

public class RobotTurnOffCommand implements Command{

    private Robot robot;

    public RobotTurnOffCommand(Robot robot) {
        this.robot = robot;
    }

    public void execute() {
        robot.turnOff();
    }
}
