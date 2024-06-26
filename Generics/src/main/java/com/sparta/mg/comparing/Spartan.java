package com.sparta.mg.comparing;

public record Spartan(Integer id, String name) implements Comparable<Spartan>{

    @Override
    public int compareTo(Spartan o) {
        return this.id().compareTo(o.id);
    }
}
