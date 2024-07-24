package com.github.nunompassos.kyu.seventh;

import java.util.function.ToDoubleFunction;

/**
 * With the release of Java 8, Java has finally added support for "lambda functions", that is,
 * variables that contain a function which can operate on data just as class methods can (well, not just as class methods can...)
 * <p>
 * Let's learn about lambdas.
 * <p>
 * This is part 2 of a 4 part series; the other katas are:
 * <p>
 * <a href="http://www.codewars.com/kata/java-functional-programming-part-1-the-beginning/java">Part 1</a><p>
 * <a href="http://www.codewars.com/kata/java-functional-programming-part-3-closured-for-business">Part 3</a><p>
 * <a href="http://www.codewars.com/kata/java-functional-programming-part-4-row-row-row-your-boat-gently-down-the-dot-dot-dot">Part 4</a><p>
 * Last time, we did something similar to this:
 * <p>
 * Function<MyObject, String> f = p -> p.toString();<p>
 * String myString = f.apply(myObject); //Stores whatever the toString() of myObject is in myString<p>
 * But what if we need more than one line in our function for the calculations?
 * The syntax to do so is to enclose the function's commands in curly brackets and include a return statement:
 * <p>
 * Function<MyObject, String> f = p -> {StringBuffer out = new StringBuffer();<p>
 *                                      out.append(p.getName());<p>
 *                                      out.append(MyObject.getStaticName());<p>
 *                                      out.append("Constant message");<p>
 *                                      return out.toString();<p>
 *                                };<p>
 * Given this POJO:
 * <p>
 * public class Triangle {<p>
 *   public final int height;<p>
 *   public final int base;<p>
 *   private double area;<p>
 *   public void setArea(double a) {<p>
 *     area = a;<p>
 *   }<p>
 *   public double getArea() {<p>
 *     return area;<p>
 *   }<p>
 * }<p>
 * Write a function that sets the area of the given Triangle and returns the area as a double.
 * Do not use the function type Function; there is a function type for converting an arbitrary class into a double, use that.
 * <p>
 * The formula for triangle area is: 1/2 * base * height
 * <p>
 * Assume valid input (base and height are both greater than 0).
 * <p>
 * A full listing of the default function types can be found <a href="http://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html">here</a>
 * <p>
 * (Aside: you may have noticed, the function type we should have used in Part 1 is Predicate, even though we used Function.)
 */
public class FunctionalProgrammingPartTwo {

    public static ToDoubleFunction<Triangle> f = t -> {
        t.setArea(0.5 * t.base * t.height);
        return t.getArea();
    };
    //Make me a function.
    //Don't use Function. Find the appropriate function to turn an
    //arbitrary class into a double. Remember the import.

}
