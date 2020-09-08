package com.kodilla.patterns.strategy.social.publisher;

import com.kodilla.patterns.strategy.social.publisher.SocialPublisher;

public class SnapchatPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "User publish posts on Snapchat";
    }
}
