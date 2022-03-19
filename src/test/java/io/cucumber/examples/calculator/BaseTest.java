package io.cucumber.examples.calculator;

import io.cucumber.logging.Config;

public abstract class BaseTest {

    public BaseTest() {
        Config.initTestLogging();
        System.err.println("Inside constructor for BaseTest");
    }

//    static {
//        Config.initTestLogging();
//        System.err.println("Inside static block!");
//    }

}
