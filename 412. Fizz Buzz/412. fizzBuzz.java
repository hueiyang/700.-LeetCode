// 3ms 98.59%
class Solution {
    public List<String> fizzBuzz(int n) {
        List result = new ArrayList<String>();
        
        for(int i = 1 ; i <= n ; i++){
            if(i%15==0){
                result.add("FizzBuzz");
                continue;
            }else if(i%3==0){
                result.add("Fizz");
                continue;
            }else if(i%5==0){
                result.add("Buzz");
                continue;
            }else{
                result.add(Integer.toString(i));
            }                
        }
        return result;
    }
}