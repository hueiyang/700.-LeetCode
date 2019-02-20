class Solution { // Runtime: 3 ms, faster than 99.59% Memory Usage: 38.4 MB, less than 38.82% 
    public int strStr(String haystack, String needle) {
        if(needle.equals("")) return 0; // needle == null >> return 0.
        
        int len_hay = haystack.length();
        int len_needle = needle.length();
        
        for( int i = 0 ; i < len_hay-len_needle+1 ; i++){
            // find the first same character.
            if( haystack.charAt(i) == needle.charAt(0)){
                if(len_needle == 1) return i;
                else{
                    if(haystack.substring(i, i+len_needle).equals(needle))   return i;
                }
            }
        }
        
        return -1;  // needle not found >> return -1.
    }
}
// public class Solution {
//     public int strStr(String haystack, String needle) {
//         int l1 = haystack.length(), l2 = needle.length();
//         if (l1 < l2) {
//             return -1;
//         } else if (l2 == 0) {
//             return 0;
//         }
//         int threshold = l1 - l2;
//         for (int i = 0; i <= threshold; ++i) {
//             if (haystack.substring(i,i+l2).equals(needle)) {
//                 return i;
//             }
//         }
//         return -1;
//     }
// }

