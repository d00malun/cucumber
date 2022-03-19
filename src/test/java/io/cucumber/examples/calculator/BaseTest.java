package io.cucumber.examples.calculator;

import io.cucumber.logging.Config;
import org.junit.jupiter.api.BeforeAll;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseTest {

    private static final Logger log = LoggerFactory.getLogger(BaseTest.class);

    @BeforeAll
    static void beforeAll(){
        log.warn("Log from 'beforeAll()' inside BaseTest");
        Config.initTestLogging();
    }

}
