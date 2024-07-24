package com.github.nunompassos.kyu.seventh;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class OverflowingWithJoyTest {
    @Test
    public void test00() {
        assertEquals(0, OverflowingWithJoy.multiply(0, 0));
    }

    @Test
    public void test2345() {
        assertEquals(1035, OverflowingWithJoy.multiply(23, 45));
    }

    @Test
    public void test3456() {
        assertEquals(-1904, OverflowingWithJoy.multiply(-34, 56));
    }

    @Test
    public void testMin() {
        assertEquals(Integer.MIN_VALUE, OverflowingWithJoy.multiply(-32768, 65536));
    }

    @Test
    public void testMax() {
        assertEquals(Integer.MAX_VALUE - 1, OverflowingWithJoy.multiply(42966, 49981));
    }

    @Test
    public void testOverflowMax() {
        assertThrows(ArithmeticException.class, () -> OverflowingWithJoy.multiply(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test
    public void testOverflowMin() {
        assertThrows(ArithmeticException.class, () -> OverflowingWithJoy.multiply(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    @Test
    public void testOverflowMaxMin() {
        assertThrows(ArithmeticException.class, () -> OverflowingWithJoy.multiply(Integer.MAX_VALUE, Integer.MIN_VALUE));
    }

    @Test
    public void testOverflow1() {
        assertThrows(ArithmeticException.class, () -> OverflowingWithJoy.multiply(39650, 54161));
    }

    @Test
    public void testOverflow2() {
        assertThrows(ArithmeticException.class, () -> OverflowingWithJoy.multiply(42967, 49981));
    }
}
