class Solution {
    public int reverseBits(int n) {
        int[] bits = new int[32];

    // Store 32 bits
    for (int i = 0; i < 32; i++) {
        bits[i] = (int)(n & 1);
        n = n >> 1;
    }

    // Reverse bits
    int result = 0;

    for (int i = 0; i < 32; i++) {
        result = result * 2 + bits[i];
    }

    return result;
        
    }
}
