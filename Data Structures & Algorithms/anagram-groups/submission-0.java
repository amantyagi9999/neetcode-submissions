class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        int n = strs.length;
        List<List<String>> ans = new ArrayList<>();


        for(int i= 0; i< n ; i++){
            String s = strs[i];
            char[] charr = s.toCharArray();
            Arrays.sort(charr);
            String str = new String(charr);
            if(map.containsKey(str)){
                map.get(str).add(s);
            }
            else{
                List<String> temp = new ArrayList<>();
                temp.add(s);
                map.put(str, temp);
            }

        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }   

        return ans;
        
    }
}
