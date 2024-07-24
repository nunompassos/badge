package com.github.nunompassos.kyu.seventh;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FunctionalProgrammingPartOneTest {

    @Test
    public void testJohnSmith() {
        Student jSmith = new Student("John", "Smith", "js123");
        assertTrue(FunctionalProgrammingPartOne.f.apply(jSmith), "John Smith with student number js123 did not return true");
    }

}
