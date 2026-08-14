class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> arr=new ArrayList<>();
        int tar=target;
        for(int i=0;i<nums.length;i++){
            tar= target-nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==tar){
                    arr.add(i);
                    arr.add(j);
                    return new int[]{arr.get(0),arr.get(1)};
                }
            }
        }
        return new int[0];
    }
}
