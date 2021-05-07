package Observable;

import Observer.IObserver;

import java.util.ArrayList;

public class WeatherData implements IObservable {

    private ArrayList observers;
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void removeObserver(IObserver o) {
        int index = observers.indexOf(o);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    @Override
    public void registerObserver(IObserver o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0 ; i < observers.size(); i++) {
            IObserver observer = (IObserver) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
