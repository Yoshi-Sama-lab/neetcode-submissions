class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map=new HashMap<>();
        List<List<Integer>> li= new ArrayList<>();
        for(int s:nums){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(int i=0;i<=nums.length;i++){
            li.add(new ArrayList<>());
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int num=entry.getKey();
            int value=entry.getValue();
            li.get(value).add(num);
        }
        int[] result=new int[k];
        int index=0;
        for(int i=li.size()-1;i>0;i--){
            for(int num:li.get(i)){
                result[index++]=num;
                if(index==k){
                    return result;
                }
            }
        }
        return result;
    
    }
}
