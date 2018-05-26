package weatherForecast;

import notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherForecast implements Observable {

    private int temperature;
    private int pressure;
    private Set<Observer> registerObserver = new HashSet<Observer>();

    public void registerObserver(Observer observer) {

    }

    public void unregisterObserver(Observer observer) {

    }

    public void notifyObserver(Observer observer) {

    }
}
