package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies(){
        //given
        Millenials jay = new Millenials("Jay Scholes");
        YGeneration jemma = new YGeneration("Jemma Crowford");
        ZGeneration mark = new ZGeneration("Mark Down");

        //when
        String jayShouldUse = jay.sharePost();
        String jemmaShouldUse = jemma.sharePost();
        String markShouldUse = mark.sharePost();

        //then
        assertEquals("Facebook", jayShouldUse);
        assertEquals("Twitter", jemmaShouldUse);
        assertEquals("Snapchat", markShouldUse);


    }

    @Test
    void testIndividualSharingStrategy(){
        //given
        Millenials jay = new Millenials("Jay Scholes");

        //when
        jay.setSocialPublisher(new SnapchatPublisher());
        String jayShouldUse = jay.sharePost();

        //then
        assertEquals("Snapchat", jayShouldUse);
    }
}
