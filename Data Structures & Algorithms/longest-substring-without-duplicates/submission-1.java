class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>map = new HashSet<>();
        int n =s.length();
        int count=0;
        int left=0;
        for(int right=0;right<n;right++){
            char ch=s.charAt(right);
            while(map.contains(ch)){
                map.remove(s.charAt(left));
                left++;
            }
            map.add(ch);
            count=Math.max(count,right-left+1);
        }
        return count;
    }
}
