package com.github.nunompassos.kyu.eighth;

/**
 * Each number should be formatted that it is rounded to two decimal places.
 * You don't need to check whether the input is a valid number because only valid numbers are used in the tests.
 * <p>
 * Example:
 * 5.5589 is rounded 5.56
 * 3.3424 is rounded 3.34
 */
public class FormattingDecimalPlaces {

    public static double TwoDecimalPlaces(double number) {
        return Math.round(number * 100) / 100.0;
    }

}
