class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prod = 1;
        int zerocount = 0;
        for(int i= 0; i< n; i++){
            if(nums[i] != 0)
                prod  *= nums[i];
            else
                zerocount++;
        }
        if(zerocount > 1){
            return new int[n];
        }

        int[] ans = new int[n];
        for(int i= 0; i< n; i++){
            if(zerocount > 0){
                ans[i] = (nums[i] == 0)? prod : 0;
            }
            else
                ans[i] = prod / nums[i];
            
        }

        return ans;
        
    }
}  
