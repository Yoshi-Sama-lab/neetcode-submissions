class Solution {
    public int[] productExceptSelf(int[] nums) {
       int multiple=1;
       int[] cums=new int[nums.length];
       boolean flag=false;
       int zero_case=0;
       int count=0;
       for(int num:nums){
            if(num==0){
                flag=true;
                count++;
            }
            if(num!=0){
                multiple*=num;
            }
            
            
       } 
       for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                if(!flag){
                    cums[i]=multiple/nums[i];
                }
                else{
                    cums[i]=0;
                }
            }else{
                if(!(flag) || nums[i]==0){
                    if(count>1){
                        cums[i]=zero_case;
                    }
                    else{
                        cums[i]=multiple;
                    }
                }
                else{
                    cums[i]=zero_case;
                }

            }
       }
       return cums;
    }
}  
