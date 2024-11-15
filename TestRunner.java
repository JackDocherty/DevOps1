import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

    public static void main(String[] args) {
        // Run tests in the Dec2HexTest class and store the results
        Result result = JUnitCore.runClasses(Dec2HexTest.class);

        int fails = 0;

        // Loop through any failures and print them
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
            fails++;
        }

        try {
            // Check if any tests failed
            if (fails > 0) {
                // If there are failures throw an exception to print the failure message
                throw new Exception();
            }
            // If all tests pass print success
            System.out.println("All tests passed: " + result.wasSuccessful());
        } catch (Exception e) {
            // Display the count of failed tests
            System.out.println(fails + " tests failed");
            System.exit(1);
        }

        System.exit(0);  // End program with a success status
    }
}
