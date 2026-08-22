class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int nsum = n * (n+1)/2;
        

        for(int i =0; i< n ; i++){
            nsum = nsum - nums[i];
        }

        return nsum;

        
    }
}
