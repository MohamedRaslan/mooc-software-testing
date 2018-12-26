package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

    @ParameterizedTest(name = " Case->{0}:: inputMessage= {1} , Shift= {2}  ,expectedMessage= {3}")
    @CsvSource({

        // Invalid Messages
             "'Invalid Messages', 'X' ,-3, 'invalid'","'Invalid Messages', 'X$FF' ,0, 'invalid'","'Invalid Messages', 'gt$h' ,3, 'invalid'"
            ,


        // Valid Messages
            //  Negative Shift Values.
            "'Negative Shifted ', 'a' ,-27, 'z'","'Negative Shifted ', 'ab cdf xn' ,-26, 'ab cdf xn'",
            "'Negative Shifted ', 'xyz abg' ,-5, 'stu vwb'","'Negative Shifted ', 'z' ,-2, 'x'"
            ,

            // Zero Shift.
            "'Zero Shifted ', 'a' ,0, 'a'","'Zero Shifted ', 'abc' ,0, 'abc'",
            "'Zero Shifted ', 'xyz' ,0, 'xyz'"
            ,

            // Positive Shift Values.
            "'Positive Shifted ', 'a' , 27, 'b'","'Positive Shifted ', 'ab cdf xn' ,26, 'ab cdf xn'",
            "'Positive Shifted ', 'xyz abg' , 5, 'cde fgl'","'Positive Shifted ', 'z' ,2, 'b'"

    })
    public void testAlgorithm(String partition, String inpStr , int shiftValue , String expectedResult) {
        String result = new CaesarShiftCipher().CaesarShiftCipher(inpStr,shiftValue);
        Assertions.assertEquals(expectedResult,result);

    }
}
