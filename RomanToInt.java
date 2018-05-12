import sun.tools.tree.CharExpression;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {


    public int romanToInt(String s) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int len = s.length();
        int result =0 ;
        int i=0;
        while(i< len ){
            int j = i+1;
            if(j>= len ){
                result += map.get(s.charAt(i));
                break;
            }else{
                if( map.get(s.charAt(i)) >= map.get(s.charAt(j)) ){
                    result += map.get(s.charAt(i));
                    i++;
                }else if(map.get(s.charAt(i)) < map.get(s.charAt(j))){
                    result += (map.get(s.charAt(j)) - map.get(s.charAt(i)));
                    i= i+2;
                }
            }

        }
        System.out.println(result);
        return result ;


    }
}
