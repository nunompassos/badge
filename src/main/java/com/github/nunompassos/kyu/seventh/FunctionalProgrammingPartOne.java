package com.github.nunompassos.kyu.seventh;

import java.util.function.Function;

/**
 * With the release of Java 8, Java has finally added support for "lambda functions", that is,
 * variables that contain a function which can operate on data just as class methods can (well, not just as class methods can...)
 * <p>
 * Let's learn about lambdas. This is part 1 in a series.
 * <p>
 * <a href="http://www.codewars.com/kata/java-functional-programming-part-2-multiline-functions">Part 2</a><p>
 * <a href="http://www.codewars.com/kata/java-functional-programming-part-3-closured-for-business">Part 3</a><p>
 * <a href="http://www.codewars.com/kata/java-functional-programming-part-4-row-row-row-your-boat-gently-down-the-dot-dot-dot">Part 4</a><p>
 * Coming from most scripting languages (e.g., Javascript, Python, Ruby), the concept of functions that can be passed as variables should not be anything new.
 * The syntax in Java should even look familiar:
 * <p>
 * Function<MyObject, String> f = p -> p.toString();<p>
 * String myString = f.apply(myObject); //Stores whatever the toString() of myObject is in myString<p>
 * The above is a simple mapper function: given an input of type MyObject, return a specific result of type String, in this case the toString of the object.
 * They can, of course, become much more complicated.
 * <p>
 * A full listing of the default function types can be found <a href="http://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html">here</a>
 * <p>
 * Given this POJO:
 * <p>
 * public class Student {<p>
 *   private final String firstName;<p>
 *   private final String lastName;<p>
 *   public final String studentNumber;<p>
 *   public String getFullName() {<p>
 *     return firstName + " " + lastName;<p>
 *   }<p>
 *   public String getCommaName() {<p>
 *     return lastName + ", " + firstName;<p>
 *   }<p>
 * }<p>
 * Write a Function (with the appropriate types) that returns true if a given student is "John Smith" with a student number of "js123" (otherwise return false).
 */
public class FunctionalProgrammingPartOne {

    public static Function<Student, Boolean> f = (Student s) -> "John Smith".equals(s.getFullName()) && "js123".equals(s.studentNumber);//Make me a function; remember to set the types!

}
