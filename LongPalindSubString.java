public class LongPalindSubString {


    public String longestPalindrome(String s) {

        int len = s.length();
        String result = null;
        int maxLength = 1;
        int start = 0;
        boolean[][] t = new boolean[len][len];

        // single element is always a palindrom
        for (int i = 0; i < len; i++) {
            t[i][i] = true;

        }


        // if two elements are same then it is a palindrome.
        for (int i = 0; i < len - 1; i++) {
            if((s.charAt(i) == s.charAt(i + 1))){
                t[i][i+1] = true;
                maxLength = 2 ;
                start = i ;
            }


        }

        for (int k = 3; k <= len; k++) {
            for (int i = 0; i < len-k+1; i++) {
                int j = i + k - 1;
                t[i][j] = (s.charAt(i) == s.charAt(j)) && t[i + 1][j - 1];
                if (t[i][j]) {
                    if(k> maxLength){
                        maxLength = k ;
                        start = i ;
                    }
                }
            }
        }

        result = s.substring(start, start + maxLength);
        System.out.println(result);
        return result;

    }
}
