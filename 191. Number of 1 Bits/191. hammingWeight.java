public class Solution { // Runtime: 0 ms, faster than 100.00% Memory Usage: 34.8 MB, less than 39.94%
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        
        // take n operator and 1.
        // 1 is represent 0000000001.
        // if n&1 = 1, it means that the last bit of n is 1.
        while(n != 0){
            count += n & 1;
            // n right shift one bit.
            n = n >>> 1;
            // System.out.println("now n = " + n);    
        }
        
        return count;        
    }
}