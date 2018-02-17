package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User john = new Millenials("John");
        User tom = new YGeneration("Tom");
        User jack = new ZGeneration("Jack");
        //When
        String johnWebActivity = john.sharePost();
        System.out.println(john.getName() + " has just shared some news by " + johnWebActivity + ".");
        String tomWebActivity = tom.sharePost();
        System.out.println(tom.getName() + " has just shared some news by " + tomWebActivity + ".");
        String jackWebActivity = jack.sharePost();
        System.out.println(jack.getName() + " has just shared some news by " + jackWebActivity + ".");
        //Then
        Assert.assertEquals("Facebook", johnWebActivity);
        Assert.assertEquals("Twitter", tomWebActivity);
        Assert.assertEquals("Snapchat", jackWebActivity);
    }
    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User mary = new Millenials("Mary");
        //When
        String maryWebActivity = mary.sharePost();
        System.out.println(mary.getName() + " has just shared some news by " + maryWebActivity + ".");
        mary.setSocialPublisher(new SnapchatPublisher());
        maryWebActivity = mary.sharePost();
        System.out.println(mary.getName() + " has changed her preferences. She has just shared some news by "
                + maryWebActivity + ".");
        //Then
        Assert.assertEquals("Snapchat", maryWebActivity);
    }
}
