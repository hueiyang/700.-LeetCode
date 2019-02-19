class Solution {//  Runtime: 17 ms, faster than 84.55%
    public int reverse(int x) {           
        long ans = 0;
        
        while(x != 0){
            ans *= 10;
            ans = ans + x%10;
            x -= x%10;
            x /= 10;
        }
        
        if(ans > Integer.MAX_VALUE) return 0;
        if(ans < Integer.MIN_VALUE) return 0;
        
        return (int)ans;
    }
}

// 123 / 10 = 12.3
//     %10 = 3
// 12.3/10 = 1.23
//     %10 = 2
// 1.23 %10 = 1
    
/*
String x_str;
        
        try{
            x_str = String.valueOf(x);
        }catch (Exception e){
            return 0;
        }
        
        int len = x_str.length();
        String ans_str = "";
        boolean tag = false;
        
        // System.out.println(length());
        
        if(x_str.charAt(0) == '-')
            ans_str += x_str.charAt(0);
        else
            tag = true;
        
        for(int i = len-1 ; i > 0 ; i--){
            ans_str += x_str.charAt(i);
        }
        
        if(tag) ans_str += x_str.charAt(0);
        
        int result;
        try{
            result = Integer.valueOf(ans_str);
            return result;
        }catch( Exception e){
            return 0;
        }
*/