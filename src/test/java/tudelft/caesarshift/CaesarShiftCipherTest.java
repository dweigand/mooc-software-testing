package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {
    @ParameterizedTest(name = "NegShifts: ({0}, {1}) = {2}")
    @CsvSource({
            "'a',-1,'z'", "'aa',-1,'zz'"
    })
    public void NegShifts(String str, int shift, String expectedResult) {
        String result = new CaesarShiftCipher().CaesarShiftCipher(str, shift);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "ZeroShifts: ({0}, {1})")
    @CsvSource({
            "'',0", "'a',0", "'z',0", "'jdgawug',0",
            "'',26", "'a',26", "'z',26", "'jdgawug',26"
    })
    public void ZeroShifts(String str, int shift) {
        String result = new CaesarShiftCipher().CaesarShiftCipher(str, shift);
        Assertions.assertEquals(str, result);
    }

    @ParameterizedTest(name = "Rot13: {0}")
    @CsvSource({
            "''", "'a'", "'z'", "'jdgawug'"
    })
    public void rot13(String str) {
        String intermediate = new CaesarShiftCipher().CaesarShiftCipher(str, 13);
        String result = new CaesarShiftCipher().CaesarShiftCipher(intermediate, 13);
        Assertions.assertEquals(str, result);
    }

    @ParameterizedTest(name = "Length: {0}")
    @CsvSource({
            "''", "'a'", "'z'", "'aljgouwrthwoudgbd'"
    })
    public void length(String str) {
        String result = new CaesarShiftCipher().CaesarShiftCipher(str, 13);
        Assertions.assertEquals(str.length(), result.length());
    }
}
