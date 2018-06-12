package metoda_szablonowa.templateMethodStartCar;

public class StartTheCarSequence extends CarStartingSequence{


    @Override
    public void startTheIgnition() {
        System.out.println("Przekrecamy kluczyk");
    }

    @Override
    public void setTheGear() {
        System.out.println("Wybieramy bieg");
    }
}
