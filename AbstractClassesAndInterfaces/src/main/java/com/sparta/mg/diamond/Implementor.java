package com.sparta.mg.diamond;

public class Implementor implements InterfaceOne, InterfaceTwo{
    @Override
    public String diamondMethod() {
        return InterfaceTwo.super.diamondMethod();
    }
}
