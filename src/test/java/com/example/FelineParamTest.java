package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)

public class FelineParamTest {
    private final int numberOfKitten;
    private final int expected;

    public FelineParamTest(int numberOfKitten, int expected) {
        this.numberOfKitten = numberOfKitten;
        this.expected = expected;
    }
    @Parameterized.Parameters
    public static Object[][] getMultiplicationData() {
        return new Object[][] {
                { 2,  2},
                { 1,  1},
                { 0,  0},
        };
    }
    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens(numberOfKitten);
        assertEquals(expected, actual);
    }


}
