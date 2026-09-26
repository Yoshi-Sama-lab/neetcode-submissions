class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int curr=0,ans=0;
        for(int c:nums){
            if(c==1){
                curr++;
            }else{
                ans=Math.max(ans,curr);
                curr=0;
            }
        }
        ans=Math.max(ans,curr);
        return ans;
    }
}