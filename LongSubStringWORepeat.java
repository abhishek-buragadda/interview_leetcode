import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class LongSubStringWORepeat {
  /*  public int lengthOfLongestSubstring(String s) {
      int start  =0 , end  =0 ,maxlength= 0;
      Hashtable<Character,Integer> hashtable = new Hashtable();
     // hashtable.put(s.charAt(0),0); end++;
       while( end < s.length()){
            if(hashtable.get(s.charAt(end)) == null  ){
                hashtable.put(s.charAt(end), 0);
                end++;
            }else{
                int currLen = end-start;
                maxlength = maxlength > currLen ?maxlength: currLen;
                start = end;
                end++;
                hashtable = new Hashtable();
                hashtable.put(s.charAt(start),0);
            }

       }
       return maxlength;
    }
    */

  /*

        better implementation.
   */

    public int lengthOfLongestSubstring(String s ){
        int n = s.length(), ans = 0 ;
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for( int j =0 , i =0 ; j< n ; j ++){
            if(map.containsKey(s.charAt(j)) ){
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j-i+1);
            map.put(s.charAt(j),j+1);
        }
        return ans ;
    }

}
