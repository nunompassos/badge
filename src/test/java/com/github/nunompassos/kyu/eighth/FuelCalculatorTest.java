package com.github.nunompassos.kyu.eighth;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FuelCalculatorTest {

    @Test
    public void exampleTests() {
        Assertions.assertEquals(5.65d, FuelCalculator.fuelPrice(5, 1.23d), 0.001d);
        Assertions.assertEquals(18.40d, FuelCalculator.fuelPrice(8, 2.5d), 0.001d);
        Assertions.assertEquals(27.50d, FuelCalculator.fuelPrice(5, 5.6d), 0.001d);
    }
}
