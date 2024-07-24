package com.github.nunompassos.kyu.seventh;

import java.util.function.IntUnaryOperator;

/**
 * With the release of Java 8, Java has finally added support for "lambda functions", that is,
 * variables that contain a function which can operate on data just as class methods can (well, not just as class methods can...)
 * <p>
 * Let's learn about lambdas. This is part 3 in a series of 4.
 * <p>
 * <a href="http://www.codewars.com/kata/java-functional-programming-part-1-the-beginning/java">Part 1</a><p>
 * <a href="http://www.codewars.com/kata/java-functional-programming-part-2-multiline-functions">Part 2</a><p>
 * <a href="http://www.codewars.com/kata/java-functional-programming-part-4-row-row-row-your-boat-gently-down-the-dot-dot-dot">Part 4</a><p>
 * We've now got a handle on Java lambda functions (even multi-line ones), but do Java lambdas have all the features of scripting functions? Like closures?
 * <p>
 * Yes. And, like in every language that supports them, closures give people headaches. Let's learn about closures!
 * <p>
 * What is a closure?
 * In programming, a closure is a function that retains the context in which it was created.
 * <p>
 * What.
 * <p>
 * Okay, say we have these statements:
 * <p>
 * int foo = 5;<p>
 * Function<String, Integer> f = s -> s.length + foo;<p>
 * f.apply("somestring"); //Should be 15<p>
 * Given an input of "somestring", f should return 15. But what happens when f leaves this context?
 * <p>
 * public void someMethod() {<p>
 *   int foo = 5;<p>
 *   Function<String, Integer> f = s -> s.length + foo;<p>
 *   f.apply("somestring"); //Should be 15<p>
 *   sendMethod(f);<p>
 * }<p>
 * public void sendMethod(Function<String, Integer> f) {<p>
 *   f.apply("otherstring"); //Should return 16<p>
 * }<p>
 * Does f still know foo is 5 when f is in sendMethod? foo is a local variable to someMethod, after all. Yes, f knows 5 is 5; that's what closures do.
 * <p>
 * Write a factory that creates adder functions. Depending on what is passed to the create method, the function will, when called,
 * add that amount to another amount given to the function. In other words:
 * <p>
 * f = AdderFactory.create(1); //Adds 1 to everything<p>
 * f.applyAsInt(4) == 5;<p>
 * f.applyAsInt(10) == 11;<p>
 * f.applyAsInt(-5) == -4;<p>
 * A full listing of the default function types can be found <a href="http://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html">here</a>
 * <p>
 * As in Part 2, don't use the default Function class, but the most appropriate class: the one that takes an int and returns an int; you shouldn't need to use any generics.
 */
public class FunctionalProgrammingPartThree {

    public static IntUnaryOperator create(final int addTo) {
        return i -> i + addTo;
    }
}
