class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<Character>> link = new ArrayList<>(); 
        for(int i = 0; i < strs.length; i++){
            List<Character> perm = new ArrayList<>();
            for(char c : strs[i].toCharArray()){
                perm.add(c);
            }
            Collections.sort(perm);
            link.add(perm);
        }
        boolean[] visited = new boolean[strs.length];
        List<List<String>> pink= new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            if(visited[i]){
                continue;
            }
            List<String> piece=new ArrayList<>();

            piece.add(strs[i]);
            visited[i]=true;


            for(int j=i+1;j<strs.length;j++){
                if(visited[j]){
                    continue;
                }
                if(link.get(i).equals(link.get(j))){
                    piece.add(strs[j]);
                    visited[j]=true;
                }
            }
            pink.add(piece);
        }
        return pink;
    }
}
