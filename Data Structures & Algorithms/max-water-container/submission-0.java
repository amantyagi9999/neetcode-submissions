class Solution {
    public int maxArea(int[] A) {
        int n = A.length;
        int s = 0;
        int e = n-1;
        int ans = 0;

        while(s < e){
            int area = Math.min(A[s],A[e]) * (e-s);
            ans = Math.max(ans, area);
            if(A[s] <= A[e])
                s++;
            else
                e--;
        }
        
        return ans;
    }
}
