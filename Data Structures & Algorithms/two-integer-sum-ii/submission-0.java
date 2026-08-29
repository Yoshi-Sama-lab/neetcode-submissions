class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n =numbers.length;
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<n;i++){
            hash.put(numbers[i],i);
        }
        for(int i=0;i<n;i++){
            int focus=target-numbers[i];
            if(hash.containsKey(focus)){
                return new int[]{i+1,hash.get(focus)+1};
            }
        }
        return new int[]{};
    }

}
