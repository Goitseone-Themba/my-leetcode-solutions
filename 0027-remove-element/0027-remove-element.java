class Solution {
    public int removeElement(int[] nums, int val) {
        int[] newNums = new int[nums.length];
        int visited = -1;
        int k = 0;

        for(int i = 0; i < nums.length; i++) {
            for(int j = i; j < nums.length; j++) {
                if(j > visited) {
                    if(nums[j] != val) {
                        visited = j;
                        newNums[i] = nums[j];
                        k++;
                        break;
                    }
                    else {
                        visited = j;
                    }
                }
            }
        }

        for(int i = 0; i < newNums.length; i++) {
            nums[i] = newNums[i];
        }

        return k;
    }
}