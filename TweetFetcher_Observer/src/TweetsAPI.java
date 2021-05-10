import Observable.TweetData;

public class TweetsAPI {
    public static void main(String[] args) {
        TweetData tweetData = new TweetData();

        DisplayTweetData displayTweetData = new DisplayTweetData(tweetData);

        tweetData.setData("Quentin", "This is the observer pattern");
        tweetData.setData("Tom", "Design patterns are so cool.");
        tweetData.setData("Maggie", "I don't like the spider pig!");

    }

}
