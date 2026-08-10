class Solution {
    public int longestConsecutive(int[] nums) {
        int n  = nums.length;
        if(n == 0)
            return 0;

        Arrays.sort(nums);
        int count = 1 ;
        int maxi = Integer.MIN_VALUE;

        for(int i= 1; i< n; i++){
            int diff = Math.abs(nums[i] - nums[i-1]);
            if(diff == 0)
                continue;
            else if(diff== 1){
                count++;
                maxi  = Math.max(maxi, count);
            }
            else{
                count = 1;
            }
        }

        return Math.max(count, maxi);
    }
}
