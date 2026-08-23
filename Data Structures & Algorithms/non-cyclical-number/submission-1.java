class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int digitsum = n;
        while(!set.contains(digitsum)){
            set.add(digitsum);
            digitsum = sumOfDigit(digitsum);
            if(digitsum == 1)
                return true;

        }

        return false;
    }

    public int sumOfDigit(int n){
        int sum = 0;
        while(n > 0){
            int d = n % 10;
            sum += d * d;
            n = n/10;
        }
        return sum;
    }
}
