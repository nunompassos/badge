package com.github.nunompassos.kyu.seventh;

public class Cat implements Comparable<Cat>
{
    public String name;
    public double weight;

    public Cat(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Cat c) {
        return name.compareTo(c.name);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Cat) {
            return name.equals(((Cat) o).name);
        }
        return false;
    }
}
