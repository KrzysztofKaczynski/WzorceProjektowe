package komenda_warsztat.workshop.command;

import komenda_warsztat.workshop.CoffeMaker;

public class CoffeMakerTurnOnCommand implements Command{

    private CoffeMaker coffeMaker;

    public void execute() {
        coffeMaker.turnOn();
    }

    public CoffeMakerTurnOnCommand(CoffeMaker coffeMaker) {
        this.coffeMaker = coffeMaker;
    }

    public void undo() {
        coffeMaker.turnOff();
    }
}
