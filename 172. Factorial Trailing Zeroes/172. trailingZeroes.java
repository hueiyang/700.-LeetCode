class Solution { // Runtime: 10 ms, faster than 99.88% Memory Usage: 37.8 MB, less than 34.29%
    public int trailingZeroes(int n) {
        int count = 0;
        
        // the trailing zeros are produced by 5 * 2.
        // so > how many 5*2 in n! is the answer
        // but sometimes there are composed of many 5.
        // ex. 25 is two 5. we need to handle this situation like below:
        
        while(n > 4){
            // System.out.println("Half=" + half);
            n = n / 5;
            count += n; 
        }
        
        return count;
    }
}

// Breif solution
// return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);