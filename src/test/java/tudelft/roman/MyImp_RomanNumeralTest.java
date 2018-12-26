package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MyImp_RomanNumeralTest {
    @Test
    void my_singleNumbers() {
      MyImp_RomanNumeral  RomanNum = new MyImp_RomanNumeral();

        int result = RomanNum.myStrToNumconvert("I");
        Assertions.assertEquals( 1 , result);

        result = RomanNum.myStrToNumconvert("L");
        Assertions.assertEquals(  50, result);

        result = RomanNum.myStrToNumconvert("M");
        Assertions.assertEquals( 1000 , result);
    }

    @Test
    void my_numberWithManyDigits() {
        MyImp_RomanNumeral  RomanNum = new MyImp_RomanNumeral();
        int result = RomanNum.myStrToNumconvert("VIII");
        Assertions.assertEquals( 8 , result);
    }
    @Test
      void my_numberWithSubtractiveNotation() {
        MyImp_RomanNumeral  RomanNum = new MyImp_RomanNumeral();

        int result = RomanNum.myStrToNumconvert("IV");
        Assertions.assertEquals( 4 , result);
    }

    @Test
    void my_numberWithAndWithoutSubtractiveNotation() {
        MyImp_RomanNumeral  RomanNum = new MyImp_RomanNumeral();

        int result = RomanNum.myStrToNumconvert("XXXIX");
        Assertions.assertEquals( 39 , result);

        result = RomanNum.myStrToNumconvert("CCVII");
        Assertions.assertEquals( 207 , result);

        result = RomanNum.myStrToNumconvert("MMXVIII");
        Assertions.assertEquals( 2018 , result);
    }

}
