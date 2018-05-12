public class RemoveDuplicateInPlace {

    public int removeDuplicates(int[] nums) {

        int j = 1;
        int curr = 1;
        while (j < nums.length ) {
            if (nums[j] != nums[j - 1]) {
                nums[curr] = nums[j];
                j++;
                curr++;
            }
            while (j < nums.length  && nums[j] == nums[j - 1] ) {
                j++;
            }
            if(j < nums.length) {
                nums[curr] = nums[j];
                j++;
                curr++;
            }
        }
        return curr;
    }

    /*


            public int removeDuplicates(int[] nums) {
                if (nums.length == 0) return 0;
                int i = 0;
                for (int j = 1; j < nums.length; j++) {
                    if (nums[j] != nums[i]) {
                        i++;
                        nums[i] = nums[j];
                    }
                }
                return i + 1;
}
     */
}
