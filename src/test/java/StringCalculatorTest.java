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
                {"2,6", 8},
                {"1,3,5", 9},
                {"1,2,3,4", 10},
                {"1,2,3,4,5", 15},
                {"1,2,3,4,5,6", 21}
        };
    }


    @Test(dataProvider = "stringsToCalculate")
    public void Add__StringsToCalculate__ExpectedSum(String stringToCalculate, int expectedSum) {
        int actualSum = sut.Add(stringToCalculate);
        Assert.assertEquals(actualSum, expectedSum);
    }
}
