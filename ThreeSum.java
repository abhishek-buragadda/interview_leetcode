import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int sum = 0 - nums[i];
                while (l < r) {
                    List<Integer> t = null;
                    if (sum ==   nums[r] + nums[l]) {
                        t = new ArrayList<>();
                        t.add(nums[i]);
                        t.add(nums[l]);
                        t.add(nums[r]);
                        result.add(t);
                        while(l< r  && nums[l] == nums[l+1]) l++;
                        while(l< r  && nums[r] == nums[r-1]) r--;
                        l++;
                        r--;

                    } else if ( nums[r] + nums[l] > sum ) {
                        r--;
                    } else  if (nums[r]+ nums[l]  < sum){
                        l++;
                    }

                }
            }

        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
        return result;
    }
}
