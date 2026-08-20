class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded_string=new StringBuilder();
        for(String s:strs){
            encoded_string.append(s.length()).append('#').append(s);
        }
        return encoded_string.toString();
    }

    public List<String> decode(String str) {
        List<String> result=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int separate=str.indexOf("#",i);
            int length=Integer.parseInt(str.substring(i,separate));
            i=separate+1;
            result.add(str.substring(i,i+length));
            i+=length;

        }
        return result;
    }
}
