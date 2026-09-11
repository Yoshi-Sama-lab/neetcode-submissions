class Solution {
    public int maxProfit(int[] prices) {
        int n =prices.length;
        int curr_max=0;
        int buy=prices[0];
        for(int i=1;i<n;i++){
            if(buy>prices[i]){
                buy=prices[i];
            }else if(curr_max<prices[i]-buy){
                curr_max=prices[i]-buy;
            }
                
        }
        return curr_max;
    }
}