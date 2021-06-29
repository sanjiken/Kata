package com.craft.kata.service;

import com.craft.kata.KataApplicationTests;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.beans.factory.annotation.Autowired;

public class CalculatorServiceTest  extends KataApplicationTests{

    @Autowired
    private CalculatorService calculator;

    @Rule
    public ExpectedException thrown = ExpectedException.none();


    @Test
    public void emptyStringShouldReturn0() {
        Assert.assertEquals(calculator.add(""), 0);
    }

    @Test
    public void numberStringShouldReturnSameNumber() {
        Assert.assertEquals(calculator.add("1"), 1);
        Assert.assertEquals(calculator.add("5"), 5);
    }

    @Test
    public void numbersCommaDelimitedShouldBeSummed() {
        Assert.assertEquals(calculator.add("1,2"), 3);
        Assert.assertEquals(25, calculator.add("10,15"));
    }

    @Test
    public void numbersNewlineDelimitedShouldBeSummed() {
        Assert.assertEquals(calculator.add("1\n2"), 3);
        Assert.assertEquals(calculator.add("11\n13"), 24);
    }

    @Test
    public void threeNumbersDelimitedAnywayShouldBeSummed() {
        Assert.assertEquals(calculator.add("1,2,3"), 6);
        Assert.assertEquals(calculator.add("5\n2\n3"), 10);
    }

    @Test
    public void negativeInputReturnsException() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Negative input!");
        calculator.add("-1");
        calculator.add("-5,10\n-15");
    }

    @Test
    public void numbersGreaterThan1000AreIgnored() {
        Assert.assertEquals(calculator.add("5,12,1001"), 17);
        Assert.assertEquals(calculator.add("14124,22\n4,1214"), 26);
    }
}
