class Solution {
    public int longestConsecutive(int[] nums) {
        /*#[9,1,4,7,3,-1,0,5,8,-1,6]; O(nlogn) that were it messes up the things, i want O(n) as per the question but let it be
        #hash set me push to remove duplicates*/
        HashSet<Integer> hash= new HashSet<>();
        for(int num:nums){
            hash.add(num);
        }
    /*#map the hashset to list again*/
        List<Integer> map=new ArrayList<>(hash);
        /*#[9,1,4,7,3,-1,0,5,8,6]
        #now we will do checking let a random pick the first element of the list and then checking the condition if the next is +1 to that, if yes i will keep adding a count++ to it or if not then reset it to 0*/
        Collections.sort(map);
        /*[-1,0,1,3,4,5,6,7,8,9]*/
        if(map.isEmpty()){
            return 0;
        }
        int term=map.get(0);
        int count=0;
        int longest=0;
        for(int i=1;i<map.size();i++){
            int kosher=term+1;
            if(kosher==map.get(i)){
                count++;
                longest=Math.max(longest,count);
                
            }else{
                count=0;
            }
            term=map.get(i);
            
        }

        return longest+1; 
    }
}
