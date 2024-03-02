public class XUnitTest {

    public static void main(String[] args) throws Exception {
        TestSuite suite = TestCaseTest.suite();
        TestResult testResult = new TestResult();
        suite.run(testResult);
        System.out.println(testResult.getSummary());
    }
}
