import Display.IDisplay;
import Observable.IObservable;
import Observer.IObserver;

public class CurrentConditionsDisplay implements IObserver, IDisplay {
    private double temperature;
    private double humidity;
    private double pressure;
    private IObservable weatherData;

    public CurrentConditionsDisplay(IObservable weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "C degrees and " + humidity + "% humidity and "
                + pressure + "atm");
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
