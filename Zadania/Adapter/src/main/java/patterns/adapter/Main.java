package patterns.adapter;

import patterns.adapter.soketUKandEU.*;

public class Main {

    public static void main(String[] args) {

        EUDevice radio = new EUDevice() {
            public void on() {
                System.out.println("Gra muzyka");
            }
        };
        EUSoket euSoket = new EUSoket();
        euSoket.plugIn(radio);

        UKDevice angRadio = new UKDevice() {
            public void powerOn() {
                System.out.println("Londyn płonie");
            }
        };

        UKSoket ukSoket = new UKSoket();
        ukSoket.plugIn(angRadio);

        UKtoEUadapter adapter = new UKtoEUadapter(angRadio);
        euSoket.plugIn(adapter);


    }
}
