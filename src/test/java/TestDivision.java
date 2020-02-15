import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDivision {
    private Calculator calculator = new Calculator();

    @Test
    public void testDiv() {
        int firstNumber = 6;
        int secondNumber = 1;
        int expectedResult = 6;
        int result = calculator.div(firstNumber, secondNumber);
        Assert.assertEquals(expectedResult, result, String.format("Expected result of %s / %s to be %s but it was %s", firstNumber, secondNumber, expectedResult, result));
    }
}
