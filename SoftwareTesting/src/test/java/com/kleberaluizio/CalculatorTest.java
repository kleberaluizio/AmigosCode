package com.kleberaluizio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void canTwoAddNumbers(){
        Calculator underTest = new Calculator();
        var number1 = 10;
        var number2 = 20;
        var result = underTest.add(number1,number2);
        assertEquals(30, result);
    }
    @Test
    void canHandleWhenInputInZero(){
        Calculator underTest = new Calculator();
        var numbers = new int[]{1,5,3};
        var result = underTest.add(0);
        assertEquals(0, result);
    }
    @Test
    void canAddNumbersFromAGivenArray(){
        Calculator underTest = new Calculator();
        var numbers = new int[]{1,5,3};
        var result = underTest.add(numbers);
        assertEquals(9, result);
    }
}
