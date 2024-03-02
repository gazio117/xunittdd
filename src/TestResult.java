
public class TestResult {

    int runCount = 0;
    int failedCount = 0;

    public void testStarted() {
        runCount++;
    }

    public String getSummary() {
        return runCount + " run, " + failedCount + " failed";
    }

    public void testFailed() {
        failedCount++;
    }

}
