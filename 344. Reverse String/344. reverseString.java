class Solution { //2ms 99.94%
    public String reverseString(String s) {
        // int l = s.length();
        char[] arr = s.toCharArray();
        
        for(int i = 0, j = arr.length-1 ; i < arr.length/2; i++, j--){
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        
        return new String(arr);
    }
}

/* my old version.
StringBuffer r = new StringBuffer(); 
        for( int i = s.length()-1 ; i >= 0 ; i--){
            r = r.append(s.charAt(i));
        }
        return r.toString();
*/