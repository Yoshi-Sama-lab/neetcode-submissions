class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int i:piles){
            high=Math.max(high,i);
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(Caneat(mid,piles,h)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;   
    }
    private boolean Caneat(int mid,int[] piles, int h){
        long totalhours=0;

        for(int i:piles){
            totalhours+=(i+mid-1)/mid;
        }

        if(totalhours<=h){
            return true;
        }
        return false;
    }
}
