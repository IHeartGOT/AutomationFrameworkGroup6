package apiTest;


import client.tweets.TweetsClients2;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.List;

public class TweetsTest {

    protected TweetsClients2 tweetsClient;
    protected long tweetId;
    protected List<Long> tweetIdList;

    @BeforeClass
    public void setUp() {
        this.tweetsClient = new TweetsClients2();
        this.tweetIdList = new ArrayList<Long>();
    }

    @Test
    public void testGetUserTimeline() throws Exception {
        this.tweetsClient.getUserTimeline();
    }

    @Test
    public void testUserCanTweet() throws Exception {
        String tweet = "hi guys whats up!";
        this.tweetsClient.createTweet(tweet);
    }
}

