import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringsTest {

    @Test
    public void palindrome() {
        boolean expected, actual;
        expected = true;
        actual = Strings.palindrome("FLFLF");
        Assert.assertEquals(expected, actual);
        expected = true;
        actual = Strings.palindrome("FLLF");
        Assert.assertEquals(expected, actual);
        expected = true;
        actual = Strings.palindrome("fffff");
        Assert.assertEquals(expected, actual);
        expected = false;
        actual = Strings.palindrome("flff");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void counter() {
        int expected = 6, actual;
        actual = Strings.counter("fflfffdsFdfFF", "f");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isAlpha() {
        boolean expected, actual;
        expected = true;
        actual = Strings.isAlpha("string");
        Assert.assertEquals(expected, actual);
        expected = false;
        actual = Strings.isAlpha("23");
        Assert.assertEquals(expected, actual);
        expected = false;
        actual = Strings.isAlpha("fg232");
        Assert.assertEquals(expected, actual);
        expected = true;
        actual = Strings.isAlpha("GFKKdf");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isDigit() {
        boolean expected, actual;
        expected = false;
        actual = Strings.isDigit("string");
        Assert.assertEquals(expected, actual);
        expected = true;
        actual = Strings.isDigit("23");
        Assert.assertEquals(expected, actual);
        expected = false;
        actual = Strings.isDigit("fg232");
        Assert.assertEquals(expected, actual);
        expected = false;
        actual = Strings.isDigit("-234");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void splitting() {
        String expected = "Aasdfasdfsdaf sddfsafsd Fsd5334fsefsddf fsfsdsdff fsdf Fsdf F F F";
        String str = "Aasdfasdfsdaf_sddfsafsdFsd5334fsefsddf_fsfsdsdff_fsdfFsdfFFF";
        String actual = Strings.splitting(str);
        Assert.assertEquals(expected, actual);
    }
}