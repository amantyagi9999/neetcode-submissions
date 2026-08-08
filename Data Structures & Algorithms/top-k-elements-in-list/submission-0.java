class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        Map<Integer, Integer> sortedDesc = map.entrySet().stream()
.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        int[] ans = new int[k];
        int index = 0;
        for(Map.Entry<Integer,Integer> en : sortedDesc.entrySet()){
            if(index < k){
                ans[index] = en.getKey();
                index++;
            }
            else{
                break;
            }
        }

        return ans;

        
    }
}
