class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int high =numbers.length-1;
        int low=0;
        while(low<high){
            int cu_target=numbers[high]+numbers[low];
            if(cu_target<target){
                low++;
            }else if(cu_target>target){
                high--;
            }else{
                return new int[]{low+1,high+1};
            }
        }
        return new int[]{};
    }

}
