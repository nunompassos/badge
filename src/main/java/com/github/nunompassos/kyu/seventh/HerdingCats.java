package com.github.nunompassos.kyu.seventh;

import java.util.Comparator;

/**
 * In this kata, you will be creating a Java Comparator to sort cats by their weight.
 * <p>
 * The Cat class is preloaded for you., and its signature is given below:
 * <p>
 * public class Cat implements Comparable<Cat><p>
 * {<p>
 *   public String name;<p>
 *   public double weight;<p>
 * <p>
 *   public Cat(String name, double weight);<p>
 * <p>
 *   \@Override<p>
 *   public int compareTo(Cat c);<p>
 * <p>
 *   \@Override<p>
 *   public boolean equals(Object o);<p>
 * }<p>
 * In the tests, an array of cats will be populated, and then sorted using Arrays.sort(). By default, this will sort the cats by their names.
 * Your job is to complete the implementation of CatWeightComparator so that the cats are sorted by weight.
 * <p>
 * You may assume that no two cats have the same name.
 * <p>
 * For more information about Arrays, take a look <a href="http://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html">here</a>.
 * <p>
 * For more information about Comparable<T>, see <a href="http://docs.oracle.com/javase/7/docs/api/java/lang/Comparable.html">here</a>.
 * <p>
 * For more information about Comparator<T>, check out <a href="http://docs.oracle.com/javase/7/docs/api/java/util/Comparator.html">here</a>.
 */
public class HerdingCats implements Comparator<Cat>
{
    @Override
    public int compare(Cat cat1, Cat cat2)
    {
        return Double.compare(cat1.weight, cat2.weight);
    }
}
