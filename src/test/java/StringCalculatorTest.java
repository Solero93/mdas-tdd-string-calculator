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
    public static Object[][] stringwithNumbersToSum() {
        return new Object[][]{
                {"", 0},
                {"9", 9},
                {"2,6", 8},
                {"1,3,5", 9},
                {"1,2,3,4", 10},
                {"1,2,3,4,5", 15},
                {"1,2,3,4,5,6", 21},
                {"1\n2,3", 6},
                {"//;\n1;2", 3},
                {"//?\n1?2", 3}
        };
    }


    @Test(dataProvider = "stringwithNumbersToSum")
    public void Add__StringsWithNumbersToSum__ExpectedSum(String stringWithNumbersToSum, int expectedSum) {
        int actualSum = sut.Add(stringWithNumbersToSum);
        Assert.assertEquals(actualSum, expectedSum);
    }
}
