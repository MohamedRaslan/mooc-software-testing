package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class GHappyTest {

    @ParameterizedTest(name = " Case {0}: inputString: {1} , expected to be : {2}")
    @CsvSource({

            // No g.  is an exceptional test i will not use it
            //  "'No_g','X',false", "'No_g','XX',false", "'No_g','XXXX',false"
            //  ,

            // Only single g.
            "'Only_single_g','g',false","'Only_single_g','Xg',false", "'Only_single_g','gX',false" ,"'Only_single_g','gXgXgXX',false"
            ,

            // Only double g.
            "'Only_double_g','gg',true", "'Only_double_g','Xgg',true", "'Only_double_g','ggX',true",
            "'Only_double_g','ggXXggXggXXX',true", "'Only_double_g','ggXggXgg',true"
            ,

            // Double with single g.
            "'Double_with_single_g','XggXgXXgg',false", "'Double_with_single_g','ggXggXg',false", "'Double_with_single_g','gXggXgg',false", "'Double_with_single_g','ggXggXg',false"
    })
    public void testAlgorithm(String partition, String inpStr , boolean expectedResult) {
        boolean result = new GHappy().gHappy(inpStr);
        if(expectedResult)
        Assertions.assertTrue(result);
        else
        Assertions.assertFalse(result);
    }


}
