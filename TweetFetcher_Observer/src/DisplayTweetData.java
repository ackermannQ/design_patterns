import Display.IDisplay;
import Observable.IObservable;
import Observer.IObserver;

public class DisplayTweetData implements IObserver, IDisplay {

        private String tweetAuthor;
        private String tweetContent;
        private IObservable tweetData;

        public DisplayTweetData(IObservable tweetData) {
            this.tweetData = tweetData;
            tweetData.registerObserver(this);
        }


        @Override
        public void display() {
            System.out.println(tweetAuthor + " says: " + tweetContent);
        }

        @Override
        public void update(String tweetAuthor, String tweetContent) {
            this.tweetAuthor = tweetAuthor;
            this.tweetContent = tweetContent;
            display();
        }

}
