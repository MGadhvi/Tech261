package com.sparta.mg.comparing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class App {


    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4,7,7,6,4,5,6,5,3));
        ArrayList<Spartan> spartans = new ArrayList<>(Arrays.asList(
                new Spartan(2, "Alex"),
                new Spartan(1, "Manish"),
                new Spartan(3, "David")
        ));

        Collections.sort(numbers);
        System.out.println(numbers);
        System.out.println();

        Collections.sort(spartans, new SpartanComparator());
        System.out.println(spartans);
    }
}

