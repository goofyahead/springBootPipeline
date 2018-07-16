package app.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.Matchers.any;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorControllerTest {

    CalculatorController controller = new CalculatorController();

    @Test
    public void add() {
        assertEquals("5", controller.add(3, 2));
    }

    @Test
    public void multiply() {
        assertEquals("12", controller.multiply(6, 2));
    }

    @Test
    public void hello() {
        assertEquals("Greetings from Spring Boot!", controller.hello());
    }

    @Test
    public void divide() throws Exception {
        assertEquals("2", controller.divide(4, 2));
    }

    @Test
    public void divideBy0() {
        try {
            controller.divide(3, 0);
            fail();
        } catch (Exception e) {
            assertTrue(true);
        }
    }
}