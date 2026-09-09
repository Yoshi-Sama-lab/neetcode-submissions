class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int current_max=0;
        int volume=0;
        int left=0;
        int right=n-1;
        int mini=0;
        while(left<right){
            mini=Math.min(heights[left],heights[right]);
            volume=mini*(right-left);
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }

            current_max=Math.max(volume,current_max);

        }
        return current_max;
    }
}
