package tudelft.ghappy;

public class GHappy {

    public boolean gHappy(String str) {
        assert str!=null;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'g') {
                if (i > 0 && str.charAt(i-1) == 'g') { continue; }
                // bug with the  '=' sign  in  line 9 (i >=0 && ...) made a runtime exception and unexpected result
                if (i+1 < str.length() && str.charAt(i+1) == 'g') { continue; }
                return false;
            }
        }

        return true;

    }
}
