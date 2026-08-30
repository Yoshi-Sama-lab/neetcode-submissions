class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Set<List<Integer>> set=new HashSet<>();
    
        List<List<Integer>> output=new ArrayList<>();
        for(int i=0;i<n;i++){
            int focus_1=-nums[i];
            HashMap<Integer,Integer> map= new HashMap<>();
            for(int j=i+1;j<n;j++){
                int focus_2=focus_1-nums[j];
                if(map.containsKey(focus_2)){
                    List<Integer> inner=Arrays.asList(nums[i],nums[j],focus_2);
                    Collections.sort(inner);
                    set.add(inner);
                }
                map.put(nums[j],j);
            }
            
        }
        return new ArrayList<>(set);
    }
}