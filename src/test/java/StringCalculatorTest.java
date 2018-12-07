import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StringCalculatorTest {
    private StringCalculator sut;

    @BeforeMethod
    public void setUp() {
        sut = new StringCalculator();
    }

    @Test
    public void Add__EmptyString__0() {
        String given = "";
        int actual = sut.Add(given);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void Add__StringWithOneNumber__TheNumberItself() {
        String given = "9";
        int actual = sut.Add(given);
        int expected = 9;
        Assert.assertEquals(actual, expected);
    }
}
