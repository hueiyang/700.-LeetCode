class Solution {
    public int climbStairs(int n) {// Runtime: 2 ms, faster than 93.86% Memory Usage: 36.3 MB, less than 82.34%
        // only can do 1 step or 2 steps, so check the example below:
        // the basic case is f(1) = 1 and f(2) = 2, then we get f(x) = ?
        // if f(3), first we can go 1 step or 2 steps.
        // f(3) = 1step + f(2)
        // f(3) = 2step + f(1)
        // so the answer is f(3) = f(1) + f(2)
        // f(n) = f(n-1) + f(n-2).
        
        // Basic case.
        if(n <= 1 ) return 1;
        if(n == 2 ) return 2;
        
        // init the total steps when n stairs.
        int[] ans = new int[n];     
        
        ans[0] = 1;
        ans[1] = 2;
        
        for(int i = 2 ; i < n ; i++){
            ans[i] = ans[i-1] + ans[i-2];
        }
        
        return ans[n-1];
        // return go(n);
    }
    // Method 2 recursive.
//     public int go(int index){
//         if( index <= 0 )
//             return 1;
        
//         if( index == 1 )
//             return 1;
        
//         if( index == 2 )
//             return 2;
        
//         if(index > 2)
//             return go(index-1) + go(index-2);
        
//         return 0;
//     }
}