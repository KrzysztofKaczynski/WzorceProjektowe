package metoda_szablonowa.templateMethodStartCar;

public class StartTheCarSequence {

    public void startTheCar(){
        fastenSeatbelts();
        startTheIgnition();
        setTheGear();
        go();
    }

    private void fastenSeatbelts() {
        System.out.println("Zapinamy pasy");
    }

    private void startTheIgnition() {
        System.out.println("Przekrecamy kluczyk");
    }

    private void setTheGear() {
        System.out.println("Wybieramy bieg");
    }

    private void go() {
        System.out.println("Wciskamy pedał gazu");
    }
}
