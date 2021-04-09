package com.genericsTestMaximum;

public class GenericInputsForFindMaximum {
    public static void main(String args[]) {
        System.out.println("Maxium of Integer" + MaximumNumber.getMax(5, 3, 1));
        System.out.println("Maxium of Floats" + MaximumNumber.getMax(5.8f, 3.2f, 1.4f));
        System.out.println("Maxium of Strings" + MaximumNumber.getMax("Peach", "Banana", "Apple"));
    }
}
