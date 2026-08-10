class Solution {
    public int longestConsecutive(int[] nums) {
        int n  = nums.length;
        Set<Integer> set = new HashSet<Integer>();
        for(int i : nums){
            set.add(i);
        }

        int maxi = 0;
        int count = 0;
        for(int num : nums){
            if(!set.contains(num-1)){
                count = 1;
                while(set.contains(num+count)){
                    count++;
                
                }
                maxi = Math.max(count, maxi);
            }

        }

        return maxi;
        
    }
}
