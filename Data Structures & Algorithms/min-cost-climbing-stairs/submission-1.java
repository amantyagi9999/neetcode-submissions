class Solution {
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length];
        Arrays.fill(dp, -1);
        return Math.min(solve(cost, 0), solve(cost, 1));
    }

    public int solve(int[] cost, int i){
        if(i >= cost.length){
            return 0;
        }

        if(dp[i] != -1)
            return dp[i];

        int takeone = cost[i]+ solve(cost, i+1);
        int taketwo = cost[i] + solve(cost, i+2);

        dp[i] =  Math.min(takeone, taketwo);
        return dp[i];
    }
}
