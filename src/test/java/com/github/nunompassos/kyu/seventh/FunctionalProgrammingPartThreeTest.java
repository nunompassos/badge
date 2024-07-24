package com.github.nunompassos.kyu.seventh;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FunctionalProgrammingPartThreeTest {

    @Test
    public void testMakeFunction() {
        assertEquals(
            5,
            FunctionalProgrammingPartThree.create(1).applyAsInt(4),
            "Created add 1 function; gave it 4; did not get 5 back"
        );
    }

}
