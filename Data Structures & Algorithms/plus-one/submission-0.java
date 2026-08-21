class Solution {
    public int[] plusOne(int[] A) {
        int n = A.length;
        for(int i= n-1; i >= 0 ; i--){
            if(A[i]<9){
                A[i]++;
                return A;
            }
            A[i] = 0;
        }
        int[] ans = new int[n+1];
        ans[0] = 1;
        return ans;

    }
}
