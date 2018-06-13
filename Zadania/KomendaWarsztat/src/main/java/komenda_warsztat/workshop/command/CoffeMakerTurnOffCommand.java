package komenda_warsztat.workshop.command;

import komenda_warsztat.workshop.CoffeMaker;

public class CoffeMakerTurnOffCommand implements Command {

    private CoffeMaker coffeMaker;

    public CoffeMakerTurnOffCommand(CoffeMaker coffeMaker) {
        this.coffeMaker = coffeMaker;
    }

    public void execute() {
        coffeMaker.turnOff();

    }

    public void undo() {
        coffeMaker.turnOn();
    }
}
