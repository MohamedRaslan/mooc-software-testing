package tudelft.roman;

public class MyImp_RomanNumeral {
    public int myStrToNumconvert(String romanNumeral) {
        int Value = 0;
        int[] XNumerals = new int[romanNumeral.length()];
        for  (int i=0 ; i< romanNumeral.length();i++) {
            switch(romanNumeral.charAt(i)) {
                case 'I':
                    XNumerals[i]= 1 ;
                    break;
                case 'V':
                    XNumerals[i]= 5 ;
                    break;
                case 'X':
                    XNumerals[i]= 10 ;
                    break;
                case 'L':
                    XNumerals[i]= 50 ;
                    break;
                case 'C':
                    XNumerals[i]= 100 ;
                    break;
                case 'D':
                    XNumerals[i]= 500 ;
                    break;
                case 'M':
                    XNumerals[i]= 1000 ;
                    break;
            }}

        for  (int i = 0 ; i< XNumerals.length; i++ )
        {
            if (i+1 != XNumerals.length) {
                if(XNumerals[i] < XNumerals[i+1])
                    Value -= XNumerals[i];
                else
                    Value += XNumerals[i];
            }
            else
                Value += XNumerals[i];
        }


        return Value ;
    }
}
