package io.cucumber.examples.calculator.steps;

import io.cucumber.examples.calculator.BaseTest;
import io.cucumber.examples.calculator.RpnCalculator;
import io.cucumber.java.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RpnCalculatorSteps extends BaseTest {

    private static final Logger log = LoggerFactory.getLogger(RpnCalculatorSteps.class);

    private RpnCalculator calc;

    @BeforeAll
    public static void beforeAll() {
        // Runs before all scenarios
        log.warn("BEFORE ALL");
    }

    @AfterAll
    public static void afterAll() {
        // Runs after all scenarios
        log.warn("AFTER ALL");
    }

    @AfterAll
    public static void afterAll2() {
        // Runs after all scenarios
    }

    @Before("not @foo")
    public void before(Scenario scenario) {
        scenario.log("Runs before each scenarios *not* tagged with @foo");
    }

    @After
    public void after(Scenario scenario) {
        scenario.log("Runs after each scenarios");
        log.info("This is log test in AFTER on level INFO.");
    }

    @After
    public void after2(Scenario scenario) {
        scenario.log("Runs after each scenarios");
    }

    @Given("a calculator I just turned on")
    public void a_calculator_I_just_turned_on() {
        calc = new RpnCalculator();
    }

    @When("I add {int} and {int}")
    public void adding(int arg1, int arg2) {
        calc.push(arg1);
        calc.push(arg2);
        calc.push("+");
    }

    @Given("^I press (.+)$")
    public void I_press(String what) {
        calc.push(what);
    }

    @Then("the result is {int}")
    public void the_result_is(double expected) {
        assertEquals(expected, calc.value());
    }

    @Given("the previous entries:")
    public void thePreviousEntries(List<Entry> entries) {
        for (Entry entry : entries) {
            calc.push(entry.first);
            calc.push(entry.second);
            calc.push(entry.operation);
        }
    }

    static final class Entry {

        private Integer first;
        private Integer second;
        private String operation;

        public Integer getFirst() {
            return first;
        }

        public void setFirst(Integer first) {
            this.first = first;
        }

        public Integer getSecond() {
            return second;
        }

        public void setSecond(Integer second) {
            this.second = second;
        }

        public String getOperation() {
            return operation;
        }

        public void setOperation(String operation) {
            this.operation = operation;
        }

    }

}
