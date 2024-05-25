package Task03;

public class TestAutomationSystem {
    public static void main(String[] args) {
        TestScenario[] testScenario = {new LoginTest(), new PaymentTest(), new ProductSearchTest()};
        for (TestScenario scenario : testScenario) {
            scenario.runTest();
        }
    }
}
