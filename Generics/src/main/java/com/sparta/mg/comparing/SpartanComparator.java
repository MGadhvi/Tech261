package com.sparta.mg.comparing;

import java.util.Comparator;

public class SpartanComparator implements Comparator<Spartan> {

    @Override
    public int compare(Spartan o1, Spartan o2) {
        return Integer.compare(o1.id(), o2.id());
    }
}
