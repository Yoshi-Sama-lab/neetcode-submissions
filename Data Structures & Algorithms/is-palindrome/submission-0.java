class Solution {
    public boolean isPalindrome(String s) {
        List<String> parts=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char cha=s.toLowerCase().charAt(i);
            if(Character.isLetterOrDigit(cha)){
                sb.append(cha);
            }
        }
        String bs=sb.toString();
        String reverse= new StringBuilder(bs).reverse().toString();
        
        return reverse.equals(bs);
        

    }
}
