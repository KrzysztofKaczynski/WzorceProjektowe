import notification.InternetNews;
import notification.RadioNews;
import notification.TvNews;
import weatherForecast.WeatherForecast;

public class Main {
    public static void main(String[] args) {

        WeatherForecast weatherForecast = new WeatherForecast(25, 1003);

        RadioNews radioNews =new RadioNews();
        TvNews tvNews = new TvNews();
        InternetNews internetNews = new InternetNews();

        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(tvNews);
        weatherForecast.registerObserver(internetNews);

        weatherForecast.notifyObservers();

        weatherForecast.unregisterObserver(radioNews);
        weatherForecast.unregisterObserver(tvNews);

        System.out.println("Nowa prognoza - powiadommienie tylko dla serwisu internetowego:");
        weatherForecast.updateForecast(18, 1007);


    }
}
