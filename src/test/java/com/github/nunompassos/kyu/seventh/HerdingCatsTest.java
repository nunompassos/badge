package com.github.nunompassos.kyu.seventh;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class HerdingCatsTest {

    @Test
    public void testSimpleCase()
    {
        Cat[] cats = new Cat[2];
        cats[0] = new Cat("Lily", 30);
        cats[1] = new Cat("Drake", 15);

        Arrays.sort(cats, new HerdingCats());

        assertEquals("Drake", cats[0].name, "Incorrect cat found at index 0");
        assertEquals("Lily", cats[1].name, "Incorrect cat found at index 1");
    }

}
