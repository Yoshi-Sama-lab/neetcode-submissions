class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int len=position.length;

        Deque<Double>stack=new ArrayDeque<>();

        double[][] time= new double[len][2];
        
        for(int i=0;i<len;i++){
            time[i][0]=position[i];
            time[i][1]=(double) (target-position[i])/speed[i];
        }

        Arrays.sort(time,(a,b)->Double.compare(a[0],b[0]));
        for(int i=len-1;i>=0;i--){
            double curr=time[i][1];
            if(stack.isEmpty() || stack.peek()<curr){
                stack.push(time[i][1]);
            }
        }
        int fleet=0;
        while(!stack.isEmpty()){
            fleet++;
            stack.pop();
        }
        return fleet;

    }
}
