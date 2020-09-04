package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.SocialPublisher;

public class User {
    private final String userName;
    protected SocialPublisher socialPublisher;

    public User(String userName) {
        this.userName = userName;
    }

    public String sharePost() {
        return socialPublisher.share();
    }

    public void setIndividualSharingStrategy(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
