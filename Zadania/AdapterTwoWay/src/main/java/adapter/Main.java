package adapter;

import adapter.soketUKandEU.*;

public class Main {

    public static void main(String[] args) {


        EUSoket euSoket = new EUSoket();
        UKSoket ukSoket = new UKSoket();

        UKDevice angRadio = new UKDevice() {
            public void powerOn() {
                System.out.println("Londyn płonie");
            }
        };

        EUDevice euRadio = new EUDevice() {
            public void on() {
                System.out.println("Radio gra");
            }
        };

        TwoWayAdapter adapter = new TwoWayAdapter(angRadio, euRadio);

        euSoket.plugIn(adapter);
        ukSoket.plugIn(adapter);


    }
}
