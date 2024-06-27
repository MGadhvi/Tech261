package com.sparta.mg;

import java.util.Arrays;

public enum Days {
    MONDAY("Monday", 1),
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    private String name;
    private int noInWeek;

    Days(String name, int noInWeek) {
        this.name = name;
        this.noInWeek = noInWeek;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoInWeek() {
        return noInWeek;
    }

    public void setNoInWeek(int noInWeek) {
        this.noInWeek = noInWeek;
    }
}
