import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSubtraction {
    private Calculator calculator = new Calculator();


    @Test
    public void testSubWithValidData() {
        int firstNumber = 10;
        int secondNumber = 3;
        int expectedResult = 7;
        int result = calculator.sub(firstNumber, secondNumber);
        Assert.assertEquals(expectedResult, result, String.format("Expected result of %s - %s to be %s but it was %s", firstNumber, secondNumber, expectedResult, result));
    }

}
