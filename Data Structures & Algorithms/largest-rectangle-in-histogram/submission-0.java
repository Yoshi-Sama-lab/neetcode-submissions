class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stack=new ArrayDeque<>();
        int n=heights.length;
        int maxArea=0;
        int curr_height=0;
        for(int i=0;i<n;i++){
            curr_height=heights[i];

            while(!stack.isEmpty() && heights[stack.peek()] > curr_height){
                int popindex=stack.pop();
                int height=heights[popindex];
                int width;
                if(stack.isEmpty()){
                    width=i;
                }else{
                    width=i-stack.peek()-1;
                }
                maxArea=Math.max(maxArea,width*height);
            }

            stack.push(i);
        }
        while(!stack.isEmpty()){
            int popindex=stack.pop();
            int height=heights[popindex];

            int width;
            if(stack.isEmpty()){
                width=n;
            }else{
                width=n-stack.peek()-1;
            }
            maxArea=Math.max(maxArea,width*height);
        }
        return maxArea;
        
    }
}
