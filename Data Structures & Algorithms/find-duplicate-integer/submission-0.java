class Solution {
    public int findDuplicate(int[] nums) {
      int len=nums.length;
      int right=0;
      while(right<len){
        int left=right+1;
        while(left<len){
            if(nums[left]==nums[right]){
                return nums[right];
            }else{
                left++;
            }
        }
        right++;
      } 
      return -1;
    }
}
