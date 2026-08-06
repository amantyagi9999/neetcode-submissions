class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        int l1 = s.length();

        for(int i= 0; i< l1; i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        int l2 = t.length();
        for(int i = 0; i< l2 ; i++){
            char ch = t.charAt(i);
            if(!map.containsKey(ch)){
                return false;
            }
            else{
                int freq = map.get(ch)-1;
                if(freq == 0){
                    map.remove(ch);
                }
                else{
                    map.put(ch, freq);
                }
            }
        }

        return map.isEmpty();


    }
}
