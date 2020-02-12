
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestCalc {
    private Calculator calculator= new Calculator();;

    @Test
    public void testAdd (){
        int a =2;
        int b =3;
        int expectedResult = 5;
        int result = calculator.sum(a,b);
        Assert.assertEquals(expectedResult,result);
    }
    @Test
    public void testSub (){
        int a =10;
        int b =3;
        int expectedResult = 7;
        int result = calculator.sub(a,b);
        Assert.assertEquals(expectedResult,result);
    }
    @Test
    public void testDiv (){
        int a =6;
        int b =2;
        int expectedResult = 3;
        int result = calculator.div(a,b);
        Assert.assertEquals(expectedResult,result);
    }
    @Parameters({"pInt1","pInt2"})
    @Test(dependsOnMethods = { "testMult","verifyArray" })
    public void testMult2 (int a, int b){
        int expectedResult = 25;
        int result = calculator.mult(a,b);
        Assert.assertEquals(expectedResult,result);
    }

    @Test
    public void testMult (){
        int a =3;
        int b =3;
        int expectedResult = 9;
        int result = calculator.mult(a,b);
        Assert.assertEquals(expectedResult,result);
    }

    @Test
    public void verifyArray() {
        int result = calculator.sum(calculator.numbers);
        int expectedResult = 8;
        Assert.assertEquals(expectedResult,result);
    }

    @Test
    public void verifyArray2() {
        int [] array2 = {4,5};
        int result = calculator.sum(array2);
        int expectedResult = 9;
        Assert.assertEquals(expectedResult,result);
    }

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][] {
                { new Integer(345) , new Integer(36) },
        };
    }
    @Test (dataProvider = "test1")
    public void verifyArray3 (Integer n1,Integer n2){
        int result = calculator.sum(n1,n2);
        int expectedResult = 381;
        Assert.assertEquals(expectedResult,result);
    }

    @Parameters({"name"})
    @Test
    public void testSingleString(String firstName) {
        System.out.println("My name is  " + firstName);
        assert "Svyat".equals(firstName);
    }













}


