class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] cums=new int[nums.length];
       int prefix=1;
       for(int i=0;i<nums.length;i++){
        cums[i]=prefix;
        prefix*=nums[i];
       }
       int suffix=1;
       for(int i=nums.length-1;i>=0;i--){
        cums[i]*=suffix;
        suffix*=nums[i];
       }
       return cums;
       
    }
}  
