package com.sparta.mg;

public class App {
    public static void main(String[] args) {
        SwitchOnable switchOnable = () -> System.out.println("Switch on");

        // +
        //
        //Method Body -> return
        //Parameters

        switchOnable.switchOn();
        System.out.println(switchOnable.getClass());
    }
}
