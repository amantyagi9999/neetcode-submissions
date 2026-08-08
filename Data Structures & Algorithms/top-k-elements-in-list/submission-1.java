class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] freq = new List[n + 1];

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            int key = m.getKey();
            int val = m.getValue();
            freq[val].add(key);
        }

        int index = 0;
        int[] ans = new int[k];
        for(int i = freq.length-1 ; i > 0 & index < k; i--){
            for(int j : freq[i]){
                ans[index++] = j;
                if(index == k){
                    return ans;

                }
            }
        }

        return ans;
        
    }
}
