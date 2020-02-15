import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestMultiplication {
    private Calculator calculator = new Calculator();

    @Parameters({"pInt1", "pInt2"})
    @Test
    public void testMultValidInfoReadingFromTestngXml(int firstNumber, int secondNumber) {
        int expectedResult = 25;
        int result = calculator.mult(firstNumber, secondNumber);
        Assert.assertEquals(expectedResult, result, String.format("Expected result of %s * %s to be %s but it was %s", firstNumber, secondNumber, expectedResult, result));
    }

    @Test
    public void testMultValidData() {
        int firstNumber = 3;
        int secondNumber = -3;
        int expectedResult = -9;
        int result = calculator.mult(firstNumber, secondNumber);
        Assert.assertEquals(expectedResult, result, String.format("Expected result of %s * %s to be %s but it was %s", firstNumber, secondNumber, expectedResult, result));
    }
}
