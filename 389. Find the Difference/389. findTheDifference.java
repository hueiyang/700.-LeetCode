class Solution {
    public char findTheDifference(String s, String t) {
        int s_count = 0;
        int t_count = 0;
        
//         比較慢 7ms 59.86%
//         for(int i = 0 ; i < s.length() ; i++)
//             s_count += (int)s.charAt(i);
//            // System.out.println((int)s.charAt(i)); 
        
//         for(int i = 0 ; i < t.length() ; i++)
//             t_count += (int)t.charAt(i);
        
//         5ms 97.13%
        for(char one : s.toCharArray())
            s_count += (int) one;
        
        for(char one : t.toCharArray())
            t_count += (int) one;
        // System.out.println(s_count + " " + t_count);
        // System.out.println((char)(t_count-s_count));
        return (char)(t_count-s_count);
    }
}

/*
運用字元的ASCII碼，因為只有相差一個字元，所以相減就會得到答案.
#字串轉字元陣列 比較快
*/