class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> build=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            build.put(a,build.getOrDefault(a,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char b=t.charAt(i);
            if(!build.containsKey(b)||build.get(b)==0){
                return false;
            }
            build.put(b,build.get(b)-1);
        }
        return true;

    }
}
