package com.genericsTestMaximum;

public class MaximumNumber <E extends Comparable> {

    public E getMax(E x, E y, E z) {
        if (x.compareTo(y) > 0) {
            if (x.compareTo(z) > 0) {
                return x;
            }
        }
        if (y.compareTo(z) > 0) {
            return y;
        }
        return z;
    }
}
