class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int left=0,right=0;
        int[] output=new int[nums.length-k+1];
        PriorityQueue<int[]> maxHeap=new PriorityQueue<>((a,b) ->{
            if(b[0]!=a[0]){
                return b[0]-a[0];
            }else{
                return b[1]-a[1];
            }
        });
        for(int i=0;i<k;i++){
            maxHeap.offer(new int[]{nums[i],i});
        }
        output[0]=maxHeap.peek()[0];
        for(int i=k;i<nums.length;i++){
            maxHeap.offer(new int[]{nums[i],i});

            while(maxHeap.peek()[1]<i-k+1){
                maxHeap.poll();
            }
            output[i-k+1]=maxHeap.peek()[0];
        }
        return output;

    }
}
