class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack=new ArrayDeque<>();
        int[] results=new int[temperatures.length];

        for(int i=0;i<temperatures.length;i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int previousindex=stack.pop();
                results[previousindex]=i-previousindex;
            }
            stack.push(i);
        }

        return results;
    }
}
