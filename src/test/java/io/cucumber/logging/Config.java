package io.cucumber.logging;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.config.Configurator;

public class Config {

    public static void initTestLogging(){
        System.err.println("initTestLogging()");
        Configurator.setAllLevels("", Level.ALL);
    }

}
