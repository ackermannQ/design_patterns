package Observable;

import Observer.IObserver;

public interface IObservable {
    void registerObserver(IObserver o);
    void removeObserver(IObserver o);
    void notifyObservers();
}
