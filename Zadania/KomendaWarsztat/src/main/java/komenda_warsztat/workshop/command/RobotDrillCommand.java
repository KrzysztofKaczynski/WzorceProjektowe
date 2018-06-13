package komenda_warsztat.workshop.command;

import komenda_warsztat.workshop.Robot;

public class RobotDrillCommand implements Command {

    private Robot robot;

    public RobotDrillCommand(Robot robot) {
        this.robot = robot;
    }

    public void execute() {
        robot.drill();
    }

    public void undo() {

    }
}
