import java.util.ArrayList;
import java.util.List;

public class IntelligentSubstring {

    public int getSpecialSubstring(String s, int k, String charValue) {

        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        List<Character> special = new ArrayList<>();
        for (int i = 0; i < charValue.length(); i++) {
                if(charValue.charAt(i) == '0'){
                    special.add(alphabets.charAt(i));
                }
        }

        if(k==1){
            return 1 ;
        }
        return k ;





    }
}
