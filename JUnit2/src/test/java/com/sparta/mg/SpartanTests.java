package com.sparta.mg;

import org.junit.jupiter.api.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.time.LocalDate;
import java.util.stream.Stream;

public class SpartanTests {

    //BeforeAll - once before all tests - static
    //BeforeEach - before each test
    //AfterAll - once after all tests - static
    //AfterEach - once after each test

    private static Spartan manish;

    @BeforeAll
    static void setupAll(TestInfo testInfo) {
        manish = new Spartan(1, "Manish", "Java", LocalDate.now());
        System.out.println(testInfo.getDisplayName());
    }



    @BeforeEach
    void setup(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName());
    }

    @Test
    @DisplayName("Simple Test")
    void simpleTest() {
        Assertions.assertEquals(1, 1);
    }

    @AfterEach
    void tearDown(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName());
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName());
    }

    @ParameterizedTest
    @NullAndEmptySource
    @MethodSource("getListOfNames")
    void checkLengthOfString(String name) {
        Assertions.assertEquals(5, name.length());
    }

    public static Stream<Arguments> getListOfNames() {
        return Stream.of(
                Arguments.of("Manish"),
                Arguments.of("Alex")
        );
    }


}
