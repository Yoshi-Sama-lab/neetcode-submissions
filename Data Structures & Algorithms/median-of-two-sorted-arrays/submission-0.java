class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            return findMedianSortedArrays(nums2,nums1);
        }
        int low=0;
        int high=nums1.length;
        int totalelements=nums1.length+nums2.length;
        int leftsize=(totalelements+1)/2;

        while(low<=high){
            int partitionlow=low+(high-low)/2;
            int partitionhigh=leftsize-partitionlow;

            int smallleft;
            if(partitionlow==0){
                smallleft=Integer.MIN_VALUE;
            }else{
                smallleft=nums1[partitionlow-1];
            }
            int bigleft;
            if(partitionhigh==0){
                bigleft=Integer.MIN_VALUE;
            }else{
                bigleft=nums2[partitionhigh-1];
            }

            int smallright;
            if(partitionlow==nums1.length){
                smallright=Integer.MAX_VALUE;
            }else{
                smallright=nums1[partitionlow];
            }

            int bigright;
            if(partitionhigh==nums2.length){
                bigright=Integer.MAX_VALUE;
            }else{
                bigright=nums2[partitionhigh];
            }

            if(smallleft<=bigright && bigleft<=smallright){
                if((totalelements%2)==1){
                    return Math.max(smallleft,bigleft);
                }else{
                    return (Math.min(smallright,bigright)+Math.max(smallleft,bigleft))/2.0;
                }
            }else if(smallleft>bigright){
                high=partitionlow-1;
            }else{
                low=partitionlow+1;
            }
        }
        return 0.0;
    }
}
