package io.cucumber.other;

import io.cucumber.logging.Config;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


class MyCodeTest {

    private final static Logger log = LoggerFactory.getLogger(MyCodeTest.class);

    static {
        Config.initTestLogging();
    }

//    @BeforeAll
//    static void beforeAll(){
//        Configurator.setAllLevels("", Level.ALL);
//    }

    @Test
    void sumInts() {
        System.out.println("THIS IS TEXT on STDOUT!");
        System.err.println("THIS IS TEXT on STDERR!");
        log.trace("Log on TRACE level");
        log.debug("Log on DEBUG level");
        log.info("Log on INFO level");
        log.warn("Log on WARN level");
        log.error("Log on ERROR level");
        Assertions.assertEquals(2, MyCode.sumInts(1,1));
    }
}