
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import romans.RomansNumber;

public class RomansNumberTest {

    @Test
    void given164Roman_WhenConvertingToArabic_ThenReturn164() {
        String roman164 = "CLXIV";
        int result = RomansNumber.getNumberFromRoman(roman164);
        Assertions.assertEquals(164, result);
    }

    @Test
    void givenEmpty_WhenConvertingToArabic_ThenReturnMinus1() {
        String romanEmpty = "";
        int result1 = RomansNumber.getNumberFromRoman(romanEmpty);
        Assertions.assertEquals(-1, result1);
    }

    @Test
    void givenNotRoman_WhenConvertingToArabic_ThenReturnMinus1() {
        String romanEmpty = "WIX";
        int result2 = RomansNumber.getNumberFromRoman(romanEmpty);
        Assertions.assertEquals(-1, result2);
    }
}
