package com.github.nunompassos.kyu.seventh;

public class Triangle {
    public final int height;
    public final int base;
    private double area;

    public Triangle(int h, int b) {
        this.height = h;
        this.base = b;
    }

    public void setArea(double a) {
        area = a;
    }

    public double getArea() {
        return area;
    }
}
