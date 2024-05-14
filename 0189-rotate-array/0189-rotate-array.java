class Solution {
    public void rotate(int[] nums, int k) {
        Map<Integer, Integer> indices = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            indices.put((i + k) % nums.length, nums[i]);
        }
        
        for(int i = 0; i < nums.length; i++) {
            nums[i] = indices.get(i);
        }
    }
}