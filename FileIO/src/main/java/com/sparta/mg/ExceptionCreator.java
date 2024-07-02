package com.sparta.mg;

import com.sparta.mg.exceptions.CorruptedDateException;

public class ExceptionCreator {
    static void getException() {
        System.out.println(1 / 0);
    }

    public static void getCheckedException() throws InterruptedException, CorruptedDateException {
        //Code
        //throw new InterruptedException();
        throw new CorruptedDateException("Date is not valid");
    }
}