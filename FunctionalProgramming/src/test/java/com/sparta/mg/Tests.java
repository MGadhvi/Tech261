package com.sparta.mg;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {

    @Test
    @DisplayName("Check for an Exception")
    void checkForAnException() {
        int[] numbers = {1,2,3,4,5};
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> System.out.println(numbers[10]));
    }
}
