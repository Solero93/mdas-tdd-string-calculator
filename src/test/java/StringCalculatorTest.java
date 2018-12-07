import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringCalculatorTest {
    private StringCalculator sut;

    @BeforeMethod
    public void setUp() {
        sut = new StringCalculator();
    }

    @DataProvider
    public static Object[][] stringsToCalculate() {
        return new Object[][]{
                {"", 0},
                {"9", 9},
                {"2,6", 8}
        };
    }


    @Test(dataProvider = "stringsToCalculate")
    public void Add__StringsToCalculate__ExpectedSum(String stringToCalculate, int expectedSum) {
        int actualSum = sut.Add(stringToCalculate);
        Assert.assertEquals(actualSum, expectedSum);
    }
}
