package com.revature.logging;

import org.junit.jupiter.api.*;

/*
        Arrange     -> Set up your tests
        Act         -> Perform the tests
        Assert      -> Check if the tests pass/fail
 */

public class CalculatorTest {

    public Calculator calculator;

    @BeforeAll
    public static void globalSetup() {
        System.out.println("This runs only once before all the tests");

    }

    @BeforeEach
    public void setup() {
        System.out.println("This runs before each individual test");
        calculator = new Calculator();
    }

    @AfterEach
    public void tearDown() {
        System.out.println("This runs after each individual test");
    }

    @AfterAll
    public static void globalTearDown() {
        System.out.println("This runs after all the tests are done");
    }

    @Test
    public void addPositive() {
        int sum = calculator.add(10, 5);
        Assertions.assertEquals(15, sum);
    }

    @Test
    public void dividePositive() {
        int quotient = calculator.divide(10,5);
        Assertions.assertEquals(2, quotient);
    }

    @Test
    public void divideThrowsCustomException() {
        NoDividingByZero exception = Assertions.assertThrows(NoDividingByZero.class, ()->{
            calculator.divide(10,0);
        });
        Assertions.assertEquals("Can't divide by zero", exception.getMessage());

    }

}
