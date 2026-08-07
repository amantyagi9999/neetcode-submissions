class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i= 0; i< n ; i++){
            int element = nums[i];
            int diff = target-element;
            if(map.containsKey(diff)){
                ans[0] = map.get(diff);
                ans[1] = i;
            }
            else{
                map.put(element, i);
            }
        }

        return ans;
        
    }
}
