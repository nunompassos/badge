package com.github.nunompassos.kyu.eighth;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;

public class SortMyTextbooksTest {

    @Test
    public void basicTest() {
        ArrayList<String> sorted = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, "Algebra", "History", "Geometry", "English");
        Collections.addAll(sorted, "Algebra", "English", "Geometry", "History");
        assertEquals(sorted, SortMyTextbooks.sort(strings));
    }

    @Test
    public void capitalizationTest() {
        ArrayList<String> sorted = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, "Algebra", "history", "Geometry", "english");
        Collections.addAll(sorted, "Algebra", "english", "Geometry", "history");
        assertEquals(sorted, SortMyTextbooks.sort(strings));
    }

    @Test
    public void symbolsTest() {
        ArrayList<String> sorted = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, "Alg#bra", "$istory", "Geom^try", "**English");
        Collections.addAll(sorted, "$istory", "**English", "Alg#bra", "Geom^try");
        assertEquals(sorted, SortMyTextbooks.sort(strings));
    }

}
