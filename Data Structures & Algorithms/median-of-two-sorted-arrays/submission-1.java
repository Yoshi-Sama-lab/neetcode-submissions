class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            return findMedianSortedArrays(nums2,nums1);
        }
        int totalelements=nums1.length+nums2.length;
        int halfelements=(totalelements+1)/2;
        int low=0;
        int high=nums1.length;
        while(low<=high){
            int i=low+(high-low)/2;
            int j=halfelements-i;

            int maxleftA;
            if(i==0){
                maxleftA=Integer.MIN_VALUE;;
            }else{
                maxleftA=nums1[i-1];
            }
            int minrightA;
            if(i==nums1.length){
                minrightA=Integer.MAX_VALUE;
            }else{
                minrightA=nums1[i];
            }
            int maxleftB;
            if(j==0){
                maxleftB=Integer.MIN_VALUE;
            }else{
                maxleftB=nums2[j-1];
            }
            int minrightB;
            if(j==nums2.length){
                minrightB=Integer.MAX_VALUE;
            }else{
                minrightB=nums2[j];
            }

            if((minrightB>=maxleftA) && (minrightA>=maxleftB)){
                if((totalelements%2)==1){
                    return Math.max(maxleftA,maxleftB);
                }else{
                    return (Math.max(maxleftA,maxleftB)+Math.min(minrightA,minrightB))/2.0;
                }
            }else if(maxleftA>minrightB){
                high=i-1;
            }else{
                low=i+1;
            }
        }
        return 0.0;
    }
}
