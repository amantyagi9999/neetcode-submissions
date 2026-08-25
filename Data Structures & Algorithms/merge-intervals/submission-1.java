class Solution {
    public int[][] merge(int[][] A) {
        Arrays.sort(A, (a,b) -> Integer.compare(a[0], b[0]));
        List<int[]> ans = new ArrayList<>();

        int n = A.length;
        int start = A[0][0];
        int end = A[0][1];
        for(int i =1; i< n ; i++){
            int currstart = A[i][0];
            int currend = A[i][1];
            if(end >= currstart){
                end = Math.max(end, currend);
            }
            else{
                ans.add(new int[]{start, end});
                start = currstart;
                end = currend; 
            }
        }
        ans.add(new int[]{start, end});
        return ans.toArray(new int[ans.size()][]);
        
    }
}
