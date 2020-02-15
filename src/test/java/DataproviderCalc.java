
import org.testng.annotations.DataProvider;

public class DataproviderCalc {

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][] {
                { new Integer(345) , new Integer(36) },
        };
    }















}


