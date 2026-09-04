package com.revature.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {
    private static final Logger logger = LoggerFactory.getLogger(Calculator.class);

    public int add(int numOne, int numTwo) {
        logger.info("Adding together {} and {} to make {}", numOne, numTwo, numOne + numTwo);
        return  numOne + numTwo;
    }

    public int divide(int numOne, int numTwo) {
        try {
            logger.debug("User entered numbers {} and {}", numOne, numTwo);
            return numOne / numTwo;
        } catch (ArithmeticException exception) {
            logger.error("Error trying to divide {} by {}", numOne, numTwo);
            throw new NoDividingByZero("Can't divide by zero");
        }
    }
}
