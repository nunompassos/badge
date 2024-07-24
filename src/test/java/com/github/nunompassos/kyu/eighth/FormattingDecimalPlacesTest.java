package com.github.nunompassos.kyu.eighth;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FormattingDecimalPlacesTest {

    @Test
    public void Test_01()
    {
        assertEquals(4.66, FormattingDecimalPlaces.TwoDecimalPlaces(4.659725356), 0.00);
    }

    @Test
    public void Test_02()
    {
        assertEquals(173735326.38, FormattingDecimalPlaces.TwoDecimalPlaces(173735326.3783732637948948), 0.00);
    }

}
