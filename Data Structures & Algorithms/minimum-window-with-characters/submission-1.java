class Solution {
    public String minWindow(String s, String t) {
        if(s==null|| t==null|| s.length()<t.length()) return "";
        int[] tcount=new int[128];
        for(int i=0;i<t.length();i++){
            tcount[t.charAt(i)]++;
        }
        int left=0,right=0;
        int minlen=Integer.MAX_VALUE;
        int startindex=0;
        int required=t.length();

        while(right <s.length()){
            char rightchar=s.charAt(right);
            if(tcount[rightchar]>0){
                required--;
            }
            tcount[rightchar]--;
            right++;

            while(required==0){
                if(right-left<minlen){
                    minlen=right-left;
                    startindex=left;
                }
                char leftchar=s.charAt(left);
                tcount[leftchar]++;
                if(tcount[leftchar]>0){
                    required++;
                }
                left++;
            }
        }

        if(minlen==Integer.MAX_VALUE){
            return "";
        }else{
            return s.substring(startindex,startindex+minlen);
        }
    }
}
