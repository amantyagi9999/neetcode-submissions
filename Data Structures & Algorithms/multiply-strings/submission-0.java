class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }
        int n = num1.length();
        int m = num2.length();
        int[] result = new int[n+m];

        for(int i= n-1 ; i>= 0; i--){
            int d1 = num1.charAt(i)- '0';

            for(int j= m-1 ; j>= 0; j--){
                int d2 = num2.charAt(j)- '0';
                int product = d1 * d2;
                int index = i+ j +1;
                result[index] += product;
                result[index -1] += result[index]/10;
                result[index] %= 10;
            }
        }

        StringBuilder ans = new StringBuilder();
        int i= 0;
        while(i < result.length && result[i] == 0)
            i++;
        while (i < result.length) {
            ans.append(result[i]);
            i++;
        }
        return ans.toString();


        
    }
}
