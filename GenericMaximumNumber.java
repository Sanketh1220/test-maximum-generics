package com.genericsTestMaximum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GenericMaximumNumber<E extends Comparable> {

    E x, y, z;
    E[] arr;


    public void MaximumNumber(E x, E y, E z){
        this.x = x;
        this.y = y;
        this.z = z;

    }

    //method for array taking multiple arguments returns max
    public static <E extends Comparable> Comparable max (Comparable[] arr){
        Arrays.sort(arr);
        int i = arr.length;
        Comparable max = arr[i-1];
        return max;
    }

    //method for getting max of given arguments
    public static <E extends  Comparable> E getMax(E x, E y, E z) {
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
