class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        int n = strs.length;
        List<List<String>> ans = new ArrayList<>();


        for(String s : strs){
            char[] charr = s.toCharArray();
            Arrays.sort(charr);
            String str = new String(charr);
            map.putIfAbsent(str, new ArrayList<>());
            map.get(str).add(s);
            

        }

        return new ArrayList<>(map.values());
        
    }
}
