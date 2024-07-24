package com.github.nunompassos.kyu.seventh;

/**
 * Multiply two ints, but take care of overflow. If the result cannot be accurately stored in an int, throw an ArithmeticException.
 * <p>
 * (If this is too easy, try overflowing with longing.)
 */
public class OverflowingWithJoy {
    public static int multiply(int a, int b) {
        return Math.multiplyExact(a, b);
    }
}
