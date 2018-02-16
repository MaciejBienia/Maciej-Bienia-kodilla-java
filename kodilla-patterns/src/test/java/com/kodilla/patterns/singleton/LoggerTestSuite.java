package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void getLastLog() {
        //Given
        Logger logger = Logger.getInstance();
        logger.log("User created");
        logger.log("Password created");
        logger.log("Photo added");
        //When
        String log = logger.getLastLog();
        //Then
        Assert.assertEquals("Photo added", log);
    }
}
