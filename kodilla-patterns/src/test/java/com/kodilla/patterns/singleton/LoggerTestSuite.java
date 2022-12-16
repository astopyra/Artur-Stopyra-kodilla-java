package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void firstLog(){
        logger = Logger.INSTANCE;
        logger.log("first logging");
    }

    @Test
    void testGetLastLog(){
        //given
        //when
        String lastLog = logger.getLastLog();
        //then
        assertEquals("first logging", lastLog);
    }
}
