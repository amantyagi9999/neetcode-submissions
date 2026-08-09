class Solution {

    
    public String encode(List<String> strs) {
        int n = strs.size();
        StringBuilder sb = new StringBuilder();
        for(String st : strs){
            sb.append(st.length()).append("#").append(st);
        }

        return sb.toString();

    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int n = str.length();
        int strLen = 0;
        for(int i= 0; i< n ; ){
            char ch = str.charAt(i);
            while(ch >= '0' && ch <= '9'){
                strLen = strLen * 10 + (ch - '0');
                i++;
                ch = str.charAt(i);
            }

            if(ch == '#'){
                StringBuilder temp = new StringBuilder();
                int j= i;
                for(j= i+1; j< strLen +i+1; j++){
                    temp.append(str.charAt(j));
                }
                i = j;
                ans.add(temp.toString());
                strLen = 0;
            }
        }
        return ans;
    }
}
