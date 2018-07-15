package app.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

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
}