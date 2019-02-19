class Solution { // Runtime: 4 ms, faster than 99.10%
    public boolean isValid(String s) {
        Stack<Character> box = new Stack<Character>();
        
        // 將相反的符號push進去
        for(char one : s.toCharArray()){            
            if(one == '(')
                box.push(')');
            else if(one == '[')
                box.push(']');
            else if(one == '{')
                box.push('}');
            // 當讀取到另一半的時候就pop出來，相符表示順序是對的
            // 如果stack是空的表示根本沒有第一part，直接讀到另一半 => 錯誤
            else if(box.pop() != one || box.isEmpty())
                return false;
        }
        
        // 最後讀取完，如果stack是空的才表示每個都配對完成
        return box.isEmpty();
    }
}

/*
My old version 11ms
Stack<Character> box = new Stack<Character>();
        int i = 0;
        
        while(i < s.length()){
            if(search(s.charAt(i)) > 0)
                box.push(s.charAt(i));
            else if(search(s.charAt(i)) < 0){
                // System.out.println("第:" + i + "次 < 0");
                // System.out.println("第:" + box.peek());
                // System.out.println("第:" + search(s.charAt(i)));
                if(box.empty())
                    return false;
                
                if((search(box.peek()) + search(s.charAt(i))) == 0)
                    box.pop();
                else
                    return false;
            }else{
                // System.out.println("第:" + i + "次非有");
                return false;
            }
            i++;    
        }
        
        if(box.empty())
            return true;
        else
            return false;
    }
    
    public int search(char one){
        switch(one){
            case '[':
                return 1;
            case ']':
                return -1;
            case '{':
                return 2;
            case '}':
                return -2;
            case '(':
                return 3;
            case ')':
                return -3;
        }
        return 0;
*/