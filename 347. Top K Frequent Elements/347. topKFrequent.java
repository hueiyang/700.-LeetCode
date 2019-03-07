class Solution { // Runtime: 11 ms, faster than 95.97% Memory Usage: 37.4 MB, less than 99.50%
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length + 1]; // store result
        Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();   // count frequency of nums
        
        // add all nums into HashMap
        for(int num : nums){
            // getOrDefault: if get(key) has value, return it
            //               else return default value.
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        for(int key : countMap.keySet()){
            int val = countMap.get(key);
            
            // every bucket list init ArrayList()
            if(bucket[val] == null)
                bucket[val] = new ArrayList();
            
            // the bigger val is, the bigger index.
            bucket[val].add(key);
        }
        
        List<Integer> result = new ArrayList();
        
        // get reuslt key from the end of the bucket list.
        for(int i = bucket.length - 1 ; i >= 0 && result.size() < k; i--){
            if(bucket[i] != null){
                result.addAll(bucket[i]);   // the reseaon why we ues addAll() is the same frequency nums were happend.
            }
        }
        
        return result;
    }
}