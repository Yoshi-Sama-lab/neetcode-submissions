class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        ArrayList<Boolean> minimum=new ArrayList<>();
        int low=1;
        int high=0;
        for(int i:piles){
            high=Math.max(high,i);
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(Caneat(piles,h,mid)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    private boolean Caneat(int[] piles, int h,int mid){
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
