package notification;

import weatherForecast.WeatherForecast;

public class TvNews implements Observer {
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("TvNews - nowa prognoza pogody: temperatura: "
                + weatherForecast.getTemperature() + " stopni, ciśnienie: "
                + weatherForecast.getPressure() + "hPa");
    }
}
