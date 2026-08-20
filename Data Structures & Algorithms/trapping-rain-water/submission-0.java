class Solution {
    public int trap(int[] A) {
        int n = A.length;
        int[] leftmax = new int[n];
        leftmax[0] = A[0];
        for(int i= 1; i< n ; i++){
            leftmax[i] = Math.max(leftmax[i-1], A[i]);
        }

        int[] rightmax = new int[n];
        rightmax[n-1] = A[n-1];
        for(int i= n-2; i >= 0 ; i--){
            rightmax[i] = Math.max(rightmax[i+1], A[i]);
        }

        int water =0;
        for(int i= 0; i< n ; i++){
            water = water + Math.min(leftmax[i], rightmax[i])- A[i];
        }
        return water;
        
    }
}
