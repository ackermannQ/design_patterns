import Observable.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(25, 50, 1);
        weatherData.setMeasurements(35, 20, 1);
        weatherData.setMeasurements(30, 30, 1);

    }
}
