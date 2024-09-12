class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int moved = 0;

        //if nums2 is not empty add it to nums1
        if(n != 0) {
            for(int i = m; i < m+n; i++) {
                nums1[i] = nums2[moved];
                moved++;
            }
        }  

        //sort nums1
        for(int i = 0; i < m+n; i++) {
            for(int j = i+1; j < m+n; j++) {
                if(nums1[i] > nums1[j]) {
                    int store = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = store;
                }        
            }
        }   
    }
}