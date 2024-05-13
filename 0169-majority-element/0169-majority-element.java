class Solution {
    public int majorityElement(int[] nums) {
        double mid = nums.length / 2;
        double count = 0;

        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    count++;
                }
            }
            if(count > mid) {
                return nums[i];
            }
            else {
                count = 0;
            }
        }
        return 0;
    }
}