package com.kodilla.patterns.strategy.social.publisher;

public class FacebookPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "User publish posts on Facebook";
    }
}
