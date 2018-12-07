import org.testng.Assert;
import org.testng.annotations.Test;

public class StringCalculatorTest {
    @Test
    public void Add__EmptyString__0() {
        StringCalculator sut = new StringCalculator();
        String given = "";
        int actual = sut.Add(given);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }
}
