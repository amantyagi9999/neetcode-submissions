class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();

        for(int i= 0; i< n; i++){
            char ch = s.charAt(i);
            if(ch == '{' || ch == '[' || ch == '('){
                st.push(ch);
            }
            else{

                if (st.isEmpty()) {
                    return false;
                }

                char ch2 = st.pop();

                if ((ch == '}' && ch2 != '{') ||
                    (ch == ')' && ch2 != '(') ||
                    (ch == ']' && ch2 != '[')) {

                    return false;
                }
        
            }
        }

        return st.isEmpty();
        
    }
}
