public class reverse_bits {
    
    public int reverseBits(int n) {
        
//         we create res variable contain 0's
// we iterate over 32 bits

// Shift left << the last bit to the start ex: 10111 << 01111
// we do that because we need to set new bit value and don't need to override the previous one, so we move it to the end.
// Check if the current bit in n is 1 or zero and add it to result.
// Shift right >> the current bit to the last bit of the end ex: 10111 >> 11011.
// we do that because after we used this bit and set it in the res, we need to use the next bit, so we must move this value to the end


        int ans = 0;

        for(int i = 0;i<=31;i++){
            ans <<=1;
            ans += n & 1;

            n >>=1;
        }
        return ans;
    }
}
