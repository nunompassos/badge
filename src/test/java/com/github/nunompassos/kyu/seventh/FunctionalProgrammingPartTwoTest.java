package com.github.nunompassos.kyu.seventh;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FunctionalProgrammingPartTwoTest {

    @Test
    public void testArea() {
        Triangle t = new Triangle(5, 10);
        assertEquals(25D, FunctionalProgrammingPartTwo.f.applyAsDouble(t), 0.001, "Incorrect area returned");
        assertEquals(25D, t.getArea(), 0.001, "Incorrect area in Triangle object");
    }

}
