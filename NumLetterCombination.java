import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NumLetterCombination {

    public List<String> letterCombinations(String digits) {
        String[] map = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqr", "wxyz"};
        LinkedList<String> result = new LinkedList<>();
        result.add("");
        for (int i = 0; i < digits.length(); i++) {
            int digit = Character.getNumericValue(digits.charAt(i));
            String s = map[digit];
            while (result.peek().length() == i) {
                String temp = result.remove();
                for (char c : s.toCharArray()) {
                    result.add(temp + c);
                }
            }
        }
        return result;
    }
}
