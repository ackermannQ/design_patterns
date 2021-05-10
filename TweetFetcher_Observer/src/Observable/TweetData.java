package Observable;

import Observer.IObserver;

import java.util.ArrayList;

public class TweetData implements IObservable {
    private ArrayList observers;
    private String tweetAuthor;
    private String tweetContent;

    public TweetData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(IObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        int index = observers.indexOf(o);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0 ; i < observers.size(); i++) {
            IObserver observer = (IObserver) observers.get(i);
            observer.update(tweetAuthor, tweetContent);
        }
    }

    public void dataChanged() {
        notifyObservers();
    }

    public void setData(String tweetAuthor, String tweetContent) {
        this.tweetAuthor = tweetAuthor;
        this.tweetContent = tweetContent;
        dataChanged();
    }

}


