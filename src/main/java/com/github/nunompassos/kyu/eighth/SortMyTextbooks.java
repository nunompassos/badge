package com.github.nunompassos.kyu.eighth;

import java.util.List;

/**
 * HELP! <p>
 * Jason can't find his textbook! <p>
 * It is two days before the test date, and Jason's textbooks are all out of order! <p>
 * Help him sort a list (ArrayList in java) full of textbooks by subject, so he can study before the test.
 * <p>
 * The sorting should NOT be case-sensitive
 */
public class SortMyTextbooks {

    public static List<String> sort(List<String> textbooks) {
        //Cramming right before a test can't be that bad?
        textbooks.sort(String::compareToIgnoreCase);
        return textbooks;
    }

}
