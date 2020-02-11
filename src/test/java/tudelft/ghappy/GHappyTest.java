package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
    @ParameterizedTest(name = "{0}: {1} = {2}")
    @CsvSource({
            // Invalid input
            "'invalid','ashuj',true", "'invalid','0',true", "'invalid','',true"
    })
    public void invalid(String partition, String str, boolean expectedResult) {
        boolean result = new GHappy().gHappy(str);
        Assertions.assertEquals(expectedResult, result);
    }
    @ParameterizedTest(name = "{0}: {1} = {2}")
    @CsvSource({
            // No need for small bars.
            "'single','g',true", "'single','gag',true", "'single','gaga',true"
    })
    public void single(String partition, String str, boolean expectedResult) {
        boolean result = new GHappy().gHappy(str);
        Assertions.assertEquals(expectedResult, result);
    }
    @ParameterizedTest(name = "{0}: {1} = {2}")
    @CsvSource({
            // multiple
            "'multiple','gg',false", "'multiple','gaggg',false"
    })
    public void multiple(String partition, String str, boolean expectedResult) {
        boolean result = new GHappy().gHappy(str);
        Assertions.assertEquals(expectedResult, result);
    }
}
