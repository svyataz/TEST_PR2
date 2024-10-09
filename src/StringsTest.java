import org.junit.Test;

import static org.junit.Assert.*;

public class StringsTest {

    @Test
    public void palindrome() {
        System.out.println(Strings.palindrome("FLFLF"));
        System.out.println(Strings.palindrome("FLLF"));
        System.out.println(Strings.palindrome("fffff"));
        System.out.println(Strings.palindrome("flff"));
        System.out.println(Strings.palindrome("FLFdd"));
    }

    @Test
    public void counter() {
        System.out.println(Strings.counter("fflfffdsFdfFF", "f"));
    }

    @Test
    public void isAlpha() {
        System.out.println(Strings.isAlpha("string"));
        System.out.println(Strings.isAlpha("23"));
        System.out.println(Strings.isAlpha("fg232"));
        System.out.println(Strings.isAlpha("GFKKdf"));
    }

    @Test
    public void isDigit() {
        System.out.println(Strings.isDigit("string"));
        System.out.println(Strings.isDigit("23"));
        System.out.println(Strings.isDigit("fg232"));
        System.out.println(Strings.isDigit("-234"));
    }

    @Test
    public void splitting() {
        String str = "Aasdfasdfsdaf_sddfsafsdFsd5334fsefsddf_fsfsdsdff_fsdfFsdfFFF";
        System.out.println(Strings.splitting(str));
    }
}