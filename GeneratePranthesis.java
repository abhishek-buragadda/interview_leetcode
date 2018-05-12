import java.util.ArrayList;
import java.util.List;

public class GeneratePranthesis {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        int left=0;
        int right=0;
        backtrack(result, "", left, right, n );
        System.out.println(result);
        return  result;

    }

    private void backtrack(List<String> result, String curr, int left, int right, int n) {
        if( curr.length() == 2* n ){
            result.add(curr);
            return;
        }
        if( left < n ){
            backtrack(result, curr+'(', left+1, right , n );
        }
        if(right < left ){
            backtrack(result, curr+')', left, right+1, n );
        }

    }

}
