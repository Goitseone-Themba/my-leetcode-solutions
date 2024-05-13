class Solution {
    public int removeDuplicates(int[] nums) {
        int bad = 0, k = 0;

        if(nums.length < 3) {
            return nums.length;
        }

        for(int i = 1; i < nums.length - 1; i++) {
            if(nums[i] == nums[i - 1] && nums[i] == nums[i + 1]) {
                bad++;
            }
        }
        k = nums.length - bad;

        if(bad == 0) {
            return k;
        }

        for(int x = 0; x < nums.length; x++) {
            for(int i = 1; i < k; i++) {
                if(nums[i] == nums[i - 1] && nums[i] == nums[i + 1]) {
                    int holder = nums[i];
                    for(int j = i ; j < nums.length - 1; j++) {
                        nums[j] = nums[j + 1];
                    }
                    nums[nums.length - 1] = holder;
                    if((i+1) == nums.length-1) {
                        return k;
                    }
                }
            }
        }

        return k;
    }
}