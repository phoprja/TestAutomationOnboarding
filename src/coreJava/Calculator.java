package coreJava;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public int add(int a, int b) {
        logger.info("Performing addition operation");
        int result = a + b;
        logger.debug("Addition result: {}", result);
        return result;
    }

    public double divide(int a, int b) {
        logger.info("Performing division operation");
        if (b == 0) {
            logger.error("Cannot divide by zero!");
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        double result = (double) a / b;
        logger.debug("Division result: {}", result);
        return result;
    }
}

