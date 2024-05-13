class Solution {

    public boolean contains(ArrayList<Integer> list, int val) {
            for(int i: list) {
                if(i == val) {
                    return true;
                }
            }
        return false;
    }

    public int removeDuplicates(int[] nums) {
        int k = 0;
        ArrayList<Integer> newNums = new ArrayList<Integer>();

        for(int i = 0; i < nums.length; i++) {
                if(i == 0) {
                    newNums.add(nums[i]);
                    k++;
                }
                else if(!contains(newNums, nums[i])) {
                    newNums.add(nums[i]);
                    k++;
                }
        }

        for(int i = 0; i < k; i++) {
            nums[i] = newNums.get(i);
        }

        return k;
    }
}