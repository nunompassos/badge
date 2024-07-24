package com.github.nunompassos.kyu.eighth;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class PushObjectIntoArrayTest {

    @Test
    public void testSomething() {
        List<String> items = PushObjectIntoArray.push();
        assertEquals(1,items.size());
        assertEquals("an object", items.get(0));
    }

}
