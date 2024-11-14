

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.logging.Logger;

public class TestRunner {
    private static final Logger logger = Logger.getLogger(TestRunner.class.getName());

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Dec2HexTest.class);

        for (Failure failure : result.getFailures()) {
            // Replace System.out.println with logger
            logger.severe(failure.toString());
        }

        // Replace System.out.println for final result
        logger.info("All tests successful: " + result.wasSuccessful());
    }
}

