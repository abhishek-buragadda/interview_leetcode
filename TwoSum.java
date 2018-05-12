import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0 ; i < nums.length; i++){
            if( map.containsKey(target - nums[i]) ){
                result[0] = map.get(target-nums[i]);
                result[1]= i ;
            }else{
                if(map.get(nums[i]) == null){
                    map.put(nums[i],i);
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        twoSum(nums  , 9);
    }
}


