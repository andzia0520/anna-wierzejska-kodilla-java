package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.SnapchatPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User amanda = new Millenials("Amanda");
        User jessica = new YGeneration("Jessica");
        User jason = new ZGeneration("Jason");

        //When & Then
        Assert.assertEquals("User publish posts on Facebook", amanda.sharePost());
        Assert.assertEquals("User publish posts on Twitter", jessica.sharePost());
        Assert.assertEquals("User publish posts on Snapchat", jason.sharePost());
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User amanda = new Millenials("Amanda");

        //When
        String defaultStrategy = amanda.sharePost();
        amanda.setIndividualSharingStrategy(new SnapchatPublisher());
        String individualStrategy = amanda.sharePost();

        //Then
        Assert.assertEquals("User publish posts on Facebook", defaultStrategy);
        Assert.assertEquals("User publish posts on Snapchat", individualStrategy);
    }
}
