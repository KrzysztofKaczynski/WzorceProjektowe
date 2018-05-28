package notification;

import weatherForecast.WeatherForecast;

public class RadioNews implements Observer {
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("RadioNews - nowa prognoza pogody: temperatura: "
                + weatherForecast.getTemperature() + " stopni, ciśnienie: "
                + weatherForecast.getPressure() + "hPa");
    }
}
