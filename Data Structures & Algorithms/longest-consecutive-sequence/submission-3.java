class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hash= new HashSet<>();
        for(int num:nums){
            hash.add(num);
        }
        int longest=0;
        for(int num:nums){
            if(!hash.contains(num-1)){
                int len=1;
                while(hash.contains(num+len)){
                    len++;
                }
                longest=Math.max(longest,len);
            }
        }
        return longest; 
    }
}
