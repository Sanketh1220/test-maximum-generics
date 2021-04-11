package com.genericsTestMaximum;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericInputsForFindMaximum {
    public static void main(String args[]) {
        System.out.println("Maxium of Integer" + GenericMaximumNumber.getMax(5, 3, 1));
        System.out.println("Maxium of Floats" + GenericMaximumNumber.getMax(5.8f, 3.2f, 1.4f));
        System.out.println("Maxium of Strings" + GenericMaximumNumber.getMax("Peach", "Banana", "Apple"));

        System.out.println(GenericMaximumNumber.max(new Comparable[]{2, 4, 5, 8, 1, 3}));
        System.out.println(GenericMaximumNumber.max(new Comparable[]{2f, 4f, 23f, 5f, 8f}));
        System.out.println(GenericMaximumNumber.max(new Comparable[]{"Sanketh", "Noneoftheabove", "noanswer", "5f", "8fasd"}));

    }
}
