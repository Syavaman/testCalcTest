import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddition {
    private Calculator calculator = new Calculator();

    @Test
    public void testAddWithValidData() {
        int firstNumber = 2;
        int secondNumber = -3;
        int expectedResult = -1;
        int result = calculator.sum(firstNumber, secondNumber);
        Assert.assertEquals(expectedResult, result, String.format("Expected result of %s + %s to be %s but it was %s", firstNumber, secondNumber, expectedResult, result));
    }

    @Test
    public void testAddWithReadingFromArray() {
        int result = calculator.sum(calculator.numbers);
        int expectedResult = 8;
        Assert.assertEquals(expectedResult, result, String.format("Result should be %s but it is %s", expectedResult, result));
    }

    @Test(dataProvider = "test1", dataProviderClass = DataproviderCalc.class)
    public void testAddWithReadingFromDataProvider(Integer n1, Integer n2) {
        int result = calculator.sum(n1, n2);
        int expectedResult = 381;
        Assert.assertEquals(expectedResult, result, String.format("Result should be %s but it is %s", expectedResult, result));
    }
}
