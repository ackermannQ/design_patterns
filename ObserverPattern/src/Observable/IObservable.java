package Observable;

import Observer.IObserver;

public interface IObservable {
    public void removeObserver(IObserver o);
    public void registerObserver(IObserver o);
    public void notifyObservers();

}
