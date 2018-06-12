package komenda_warsztat.workshop;

public class WorkShopApp {

    private Robot robot;

    public WorkShopApp(Robot robot) {
        this.robot = robot;
    }

    public void run(){
        robot.turnOn();
        robot.cut();
        robot.drill();
        robot.turnOff();
    }
}
