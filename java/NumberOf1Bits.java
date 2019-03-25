public class NumberOf1Bits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        for(int i=0; i<32; i++) {
            count += 1&(n>>i);
        }
        return count;
    }
}
